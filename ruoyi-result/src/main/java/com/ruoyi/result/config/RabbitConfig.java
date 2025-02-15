package com.ruoyi.result.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class RabbitConfig {

    // 定义队列名称
    public static final String QUEUE_NAME = "userNotificationQueue";
    // 死信队列名称
    public static final String DEAD_LETTER_QUEUE_NAME = "userNotificationDeadLetterQueue";

    // 定义交换机名称
    public static final String EXCHANGE_NAME = "userNotificationExchange";
    // 死信交换机名称
    public static final String DEAD_LETTER_EXCHANGE_NAME = "userNotificationDeadLetterExchange";

    // 定义路由键
    public static final String ROUTING_KEY = "user.notification";
    // 死信队列路由键
    public static final String DEAD_LETTER_ROUTING_KEY = "user.notification.deadLetter";

    // 创建死信队列
    @Bean
    public Queue deadLetterQueue() {
        return new Queue(DEAD_LETTER_QUEUE_NAME, true);
    }

    // 创建死信交换机
    @Bean
    public TopicExchange deadLetterExchange() {
        return new TopicExchange(DEAD_LETTER_EXCHANGE_NAME);
    }

    // 将死信队列与死信交换机进行绑定
    @Bean
    public Binding deadLetterBinding() {
        return BindingBuilder.bind(deadLetterQueue())
                .to(deadLetterExchange())
                .with(DEAD_LETTER_ROUTING_KEY);
    }

    // 创建主队列并配置死信交换机和路由键
    @Bean
    public Queue mainQueue() {
        Map<String, Object> arguments = new HashMap<>();
        arguments.put("x-dead-letter-exchange", DEAD_LETTER_EXCHANGE_NAME); // 设置死信交换机
        arguments.put("x-dead-letter-routing-key", DEAD_LETTER_ROUTING_KEY); // 死信队列的路由键
        return new Queue(QUEUE_NAME, true, false, false, arguments);
    }

    // 创建主交换机
    @Bean
    public TopicExchange mainExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    // 将主队列与主交换机进行绑定
    @Bean
    public Binding binding() {
        return BindingBuilder.bind(mainQueue()).to(mainExchange()).with(ROUTING_KEY);
    }
}
