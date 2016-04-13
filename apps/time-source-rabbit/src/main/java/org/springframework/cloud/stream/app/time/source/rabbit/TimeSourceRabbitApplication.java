package org.springframework.cloud.stream.app.time.source.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeSourceRabbitApplication.class, args);
	}
}
