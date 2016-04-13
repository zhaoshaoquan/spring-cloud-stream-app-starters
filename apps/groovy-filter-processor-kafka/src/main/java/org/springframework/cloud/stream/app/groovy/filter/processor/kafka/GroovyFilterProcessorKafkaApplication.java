package org.springframework.cloud.stream.app.groovy.filter.processor.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroovyFilterProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroovyFilterProcessorKafkaApplication.class, args);
	}
}
