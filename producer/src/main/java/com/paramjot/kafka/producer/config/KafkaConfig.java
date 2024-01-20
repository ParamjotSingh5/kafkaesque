package com.paramjot.kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.paramjot.kafka.producer.constant.KafkaTopics.MESSAGE_TOPIC;

@Configuration
public class KafkaConfig {

    // This creates a new topic in Kafka with the name "message" and
    // returns it to the caller of this method (the Spring framework) so that it can be used to send messages to the topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(MESSAGE_TOPIC)
                .build();
    }
}
