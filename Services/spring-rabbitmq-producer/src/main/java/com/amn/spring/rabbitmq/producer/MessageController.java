package com.amn.spring.rabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class MessageController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage customMessage){
        customMessage.setMessageDate(new Date());
        customMessage.setMessageId(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(MqConfig.EXCHANGE,MqConfig.ROUTING_KEY,customMessage);
        return "Message Published";
    }
}
