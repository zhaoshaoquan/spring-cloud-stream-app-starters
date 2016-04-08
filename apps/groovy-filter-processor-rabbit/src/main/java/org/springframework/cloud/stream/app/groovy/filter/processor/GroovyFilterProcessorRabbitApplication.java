package org.springframework.cloud.stream.app.groovy.filter.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroovyFilterProcessorRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroovyFilterProcessorRabbitApplication.class, args);
	}
}
