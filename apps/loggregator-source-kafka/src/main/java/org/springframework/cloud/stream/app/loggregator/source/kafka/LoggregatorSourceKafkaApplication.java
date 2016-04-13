package org.springframework.cloud.stream.app.loggregator.source.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggregatorSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggregatorSourceKafkaApplication.class, args);
	}
}
