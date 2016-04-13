package org.springframework.cloud.stream.app.jms.source.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsSourceRabbitApplication.class, args);
	}
}
