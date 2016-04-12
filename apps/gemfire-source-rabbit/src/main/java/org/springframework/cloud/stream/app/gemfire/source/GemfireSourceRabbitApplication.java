package org.springframework.cloud.stream.app.gemfire.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GemfireSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemfireSourceRabbitApplication.class, args);
	}
}
