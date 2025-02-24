package com.amn.spring.rabbitmq.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CustomMessage {
    private String messageId;
    private String message;
    private Date messageDate;
}
