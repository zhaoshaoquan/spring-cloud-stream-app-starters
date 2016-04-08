package org.springframework.cloud.stream.app.transform.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransformProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransformProcessorKafkaApplication.class, args);
	}
}
