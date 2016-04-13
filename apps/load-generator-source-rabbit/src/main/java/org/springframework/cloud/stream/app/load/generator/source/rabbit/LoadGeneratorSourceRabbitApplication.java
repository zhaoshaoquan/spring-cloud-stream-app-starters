package org.springframework.cloud.stream.app.load.generator.source.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadGeneratorSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadGeneratorSourceRabbitApplication.class, args);
	}
}
