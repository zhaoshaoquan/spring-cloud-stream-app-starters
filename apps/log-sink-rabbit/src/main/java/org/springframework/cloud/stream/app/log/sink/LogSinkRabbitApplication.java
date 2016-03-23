package org.springframework.cloud.stream.app.log.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogSinkRabbitApplication.class, args);
	}
}
