package org.springframework.cloud.stream.app.pmml.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PmmlProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmmlProcessorKafkaApplication.class, args);
	}
}
