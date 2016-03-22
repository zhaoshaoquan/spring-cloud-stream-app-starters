package org.springframework.cloud.stream.app.http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpSourceRabbitApplication.class, args);
	}
}
