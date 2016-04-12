package org.springframework.cloud.stream.app.loggregator.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggregatorSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggregatorSourceRabbitApplication.class, args);
	}
}
