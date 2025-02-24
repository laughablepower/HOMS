package com.amn.spring.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MqConfig.QUEUE)
    public void listener(CustomMessage customMessage){
        System.out.println("message received: " + customMessage);
    }
}
