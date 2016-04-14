package org.springframework.cloud.stream.app.cq.gemfire.source.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CqGemfireSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CqGemfireSourceKafkaApplication.class, args);
	}
}
