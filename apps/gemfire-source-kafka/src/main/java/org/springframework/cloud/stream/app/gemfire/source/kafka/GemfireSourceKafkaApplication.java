package org.springframework.cloud.stream.app.gemfire.source.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GemfireSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemfireSourceKafkaApplication.class, args);
	}
}
