package org.springframework.cloud.stream.app.jms.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsSourceKafkaApplication.class, args);
	}
}
