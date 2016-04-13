package org.springframework.cloud.stream.app.pmml.processor.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PmmlProcessorRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmmlProcessorRabbitApplication.class, args);
	}
}
