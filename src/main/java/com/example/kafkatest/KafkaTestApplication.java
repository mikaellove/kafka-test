package com.example.kafkatest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, ClickInfo> kafkaTemplate) {
		return args -> {
			ClickInfo info = new ClickInfo();
			info.setTimestamp("01");
			info.setIpAdress("11.11.11");
			kafkaTemplate.send("clickTopic", info);
			kafkaTemplate.send("clickTopic", info);
		};
	}
}
