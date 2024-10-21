package com.microservice.accounts.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageProcessConfig {

    public static final String MESSAGE_DIRECT_EXCHANGE = "message-direct-exchange";
    public static final String MESSAGE_QUEUE = "message-queue";
    public static final String ROUTING_KEY_MESSAGE = "message";

    @Bean
    public DirectExchange messageDirectExchange() {
        return new DirectExchange(MESSAGE_DIRECT_EXCHANGE);
    }

    @Bean
    public Queue messageQueue() {
        return new Queue(MESSAGE_QUEUE);
    }

    @Bean
    public Binding messageBinding() {
        return BindingBuilder.bind(messageQueue()).to(messageDirectExchange()).with(ROUTING_KEY_MESSAGE);
    }
}
