package com.paramjot.kafka.producer.controller;

import com.paramjot.kafka.producer.dto.MessageDTO;
import com.paramjot.kafka.producer.service.KafkaProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/kafka/producer/message")
public class MessageController {

    private final KafkaProducerService kafkaProducerService;

    public MessageController(KafkaProducerService kafkaProducerService){
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Map<String, String>> addMessage(@RequestBody MessageDTO message) {

        if(kafkaProducerService.sendMessage(message.getMessage())){
            return new ResponseEntity<>(
                    Map.of("status", "message has been triggered to be sent")
                    , HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(
                    Map.of("status", "message has not been triggered to be sent")
                    , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
