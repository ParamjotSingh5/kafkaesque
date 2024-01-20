package com.paramot.kafka.consumer.service;

import com.paramot.kafka.consumer.constant.KafkaGroups;
import com.paramot.kafka.consumer.constant.KafkaTopics;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = KafkaTopics.MESSAGE_TOPIC, groupId = KafkaGroups.USER_GROUP)
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
