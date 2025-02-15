package com.ruoyi.result.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.result.articles.domain.AddArticlesDTO;
import com.ruoyi.result.articles.domain.Articles;
import com.ruoyi.result.config.RabbitConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerService {

    private static final Logger logger = LoggerFactory.getLogger(MessageProducerService.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    // 发送公告消息到队列
    public void sendMessage(AddArticlesDTO addArticlesDTO) {
        try {
            String message = objectMapper.writeValueAsString(addArticlesDTO);
            amqpTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME, RabbitConfig.ROUTING_KEY, message);
            logger.info("公告消息已发送到 RabbitMQ，标题：{}", addArticlesDTO.getTitle());
        } catch (JsonProcessingException e) {
            logger.error("发送公告消息失败：{}", e.getMessage(), e);
        }
    }
}
