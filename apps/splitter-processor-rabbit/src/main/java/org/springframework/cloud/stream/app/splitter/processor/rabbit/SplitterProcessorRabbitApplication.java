package org.springframework.cloud.stream.app.splitter.processor.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitterProcessorRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitterProcessorRabbitApplication.class, args);
	}
}
