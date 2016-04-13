package org.springframework.cloud.stream.app.rabbit.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitSinkRabbitApplication.class, args);
	}
}
