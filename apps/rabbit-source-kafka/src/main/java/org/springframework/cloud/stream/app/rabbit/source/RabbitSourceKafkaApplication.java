package org.springframework.cloud.stream.app.rabbit.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitSourceKafkaApplication.class, args);
	}
}
