package org.springframework.cloud.stream.app.groovy.transform.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroovyTransformProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroovyTransformProcessorKafkaApplication.class, args);
	}
}
