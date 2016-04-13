package org.springframework.cloud.stream.app.trigger.source.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TriggerSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriggerSourceRabbitApplication.class, args);
	}
}
