package org.springframework.cloud.stream.app.rabbit.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitSinkKafkaApplication.class, args);
	}
}
