package org.springframework.cloud.stream.app.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogSinkKafkaApplication.class, args);
	}
}
