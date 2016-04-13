package org.springframework.cloud.stream.app.integration.test.processor.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationTestProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationTestProcessorKafkaApplication.class, args);
	}
}
