package org.springframework.cloud.stream.app.splitter.processor.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitterProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitterProcessorKafkaApplication.class, args);
	}
}
