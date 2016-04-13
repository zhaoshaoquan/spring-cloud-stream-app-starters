package org.springframework.cloud.stream.app.load.generator.source.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadGeneratorSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadGeneratorSourceKafkaApplication.class, args);
	}
}
