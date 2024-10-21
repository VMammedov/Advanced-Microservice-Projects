package com.eazybytes.message.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {

    private static final Logger logger = LoggerFactory.getLogger(MessageProcessor.class);

    @RabbitListener(queues = "message-queue")
    public void messageToUser(String message) {
        logger.info("Log : " + message);
    }
}
