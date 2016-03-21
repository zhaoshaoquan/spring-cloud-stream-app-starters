package org.springframework.cloud.stream.app.time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeSourceKafkaApplication.class, args);
	}
}
