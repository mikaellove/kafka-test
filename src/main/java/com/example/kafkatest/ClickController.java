package com.example.kafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ClickController {

    @Autowired
    KafkaTemplate<String, ClickInfo> kafkaTemplate;

    @PostMapping(value = "/api/click", consumes = "application/json", produces = "application/json")
    public void registerClick(@RequestBody ClickInfo info) {
        info.setTimestamp(LocalDateTime.now().toString());
        kafkaTemplate.send("clickTopic", info);
    }
}
