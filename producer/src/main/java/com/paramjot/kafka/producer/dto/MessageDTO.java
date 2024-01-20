package com.paramjot.kafka.producer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDTO {

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public MessageDTO(String message) {
            this.message = message;
        }

        public MessageDTO() {
        }

        @JsonProperty("message")
        public String message;
}
