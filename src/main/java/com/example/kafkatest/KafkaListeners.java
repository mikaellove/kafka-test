package com.example.kafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "clickTopic", groupId = "click")
    void listener(String data) {
        // Räkna här
        System.out.printf("Listener recieved: " + data + "\n");
    }
}
