package org.springframework.cloud.stream.app.filter.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilterProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterProcessorKafkaApplication.class, args);
	}
}
