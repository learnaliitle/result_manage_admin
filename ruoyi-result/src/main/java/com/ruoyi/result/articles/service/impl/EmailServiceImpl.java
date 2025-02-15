package com.ruoyi.result.articles.service.impl;

import com.ruoyi.result.articles.domain.Articles;
import com.ruoyi.result.articles.service.EmailService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.core.io.InputStreamSource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender javaMailSender;  // ✅ 注入 JavaMailSender
    private static final Logger log = LoggerFactory.getLogger(EmailServiceImpl.class);  // 添加日志记录器

    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(String email, Articles article) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            // 设置有效的发件人地址
            helper.setFrom("790734188@qq.com");  // 使用配置文件中的发件人地址
            helper.setTo(email);
            helper.setSubject(article.getTitle());
            helper.setText(article.getContent(), true);

            // 获取远程文件流并确保资源关闭
            try (InputStream inputStream = new URL(article.getImageUrl()).openStream()) {
                byte[] bytes = inputStream.readAllBytes();
                helper.addAttachment("附件.pdf", new javax.mail.util.ByteArrayDataSource(bytes, "application/pdf"));
            }

            javaMailSender.send(message);
            log.info("邮件发送成功: {}", email);  // 使用日志记录成功的邮件发送
        } catch (MessagingException e) {
            log.error("邮件发送失败（MessagingException）: {}", e.getMessage(), e);
            throw new RuntimeException("邮件发送失败（MessagingException）", e);
        } catch (IOException e) {
            log.error("邮件发送失败（IO Exception）: {}", e.getMessage(), e);
            throw new RuntimeException("邮件发送失败（IO Exception）", e);
        } catch (Exception e) {
            log.error("邮件发送失败（未知异常）: {}", e.getMessage(), e);
            throw new RuntimeException("邮件发送失败（未知异常）", e);
        }
    }
}
