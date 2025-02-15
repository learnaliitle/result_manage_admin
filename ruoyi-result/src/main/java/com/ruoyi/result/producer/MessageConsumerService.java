package com.ruoyi.result.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.result.articles.domain.Articles;
import com.ruoyi.result.articles.domain.RetryMessage;
import com.ruoyi.result.articles.service.EmailService;
import com.ruoyi.result.config.RabbitConfig;
import com.ruoyi.system.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


@Service
public class MessageConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(MessageConsumerService.class);

    @Autowired
    private EmailService emailService;

    @Autowired
    private ISysUserService userService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    // 监听 RabbitMQ 主队列
    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    public void receiveAnnouncementMessage(String message) {
        try {
            Articles article = objectMapper.readValue(message, Articles.class);
            logger.info("收到 RabbitMQ 公告消息，标题：{}", article.getTitle());

            // 获取所有用户邮箱并过滤无效邮箱
            List<String> allEmails = userService.findAllEmails();
            logger.info("共获取 {} 个用户邮箱", allEmails.size());

            List<String> validEmails = allEmails.stream()
                    .filter(this::isValidEmail)
                    .collect(Collectors.toList());

            logger.info("有效邮箱数量：{}", validEmails.size());

            // 发送邮件
            for (String email : validEmails) {
                emailService.sendEmail(email, article);
            }

            logger.info("公告邮件发送任务完成！");
        } catch (JsonProcessingException e) {
            logger.error("解析公告消息失败：{}", e.getMessage(), e);
        } catch (Exception e) {
            logger.error("发送邮件失败，消息将被发送到死信队列", e);
        }
    }

    // 监听死信队列
    @RabbitListener(queues = RabbitConfig.DEAD_LETTER_QUEUE_NAME)
    public void receiveFromDeadLetterQueue(String message) {
        try {
            // 将消息反序列化为自定义的消息对象
            RetryMessage retryMessage = objectMapper.readValue(message, RetryMessage.class);

            logger.warn("收到死信队列消息，内容：{}", retryMessage.getContent());

            // 最大重试次数
            int maxRetryCount = 3;

            if (retryMessage.getRetryCount() < maxRetryCount) {
                // 如果重试次数小于最大值，则进行重试
                retryMessage.setRetryCount(retryMessage.getRetryCount() + 1);
                String updatedMessage = objectMapper.writeValueAsString(retryMessage);
                // 将消息重新发送到主队列进行重试
                amqpTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME, RabbitConfig.ROUTING_KEY, updatedMessage);
                logger.info("消息重新发送到主队列，当前重试次数：{}", retryMessage.getRetryCount());
            } else {
                // 如果超出最大重试次数，可以将消息存储到数据库或进行人工干预
                logger.error("消息重试次数超过最大限制，内容：{}", retryMessage.getContent());
                // 保存到数据库或其他地方
            }
        } catch (Exception e) {
            logger.error("处理死信消息失败：{}", e.getMessage(), e);
        }
    }


    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
}
