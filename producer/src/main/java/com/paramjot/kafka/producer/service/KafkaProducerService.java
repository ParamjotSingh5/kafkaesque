package com.paramjot.kafka.producer.service;

import com.paramjot.kafka.producer.constant.KafkaTopics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    @Autowired
    public KafkaProducerService(KafkaTemplate<String, Object> standardKafkaTemplate) {
        this.standardKafkaTemplate = standardKafkaTemplate;
    }

    private final KafkaTemplate<String, Object> standardKafkaTemplate;

    public boolean sendMessage(String message) {

        var f = standardKafkaTemplate.send(KafkaTopics.MESSAGE_TOPIC, message);

        f.thenApply(r -> {
            System.out.println("Sent message: " + message);
            return r;
        }).exceptionally(e -> {
            System.out.println("Failed to send message: " + message);
            return null;
        });

        return true;
    }
}
