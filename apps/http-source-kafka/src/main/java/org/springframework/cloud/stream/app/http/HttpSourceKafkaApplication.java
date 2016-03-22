package org.springframework.cloud.stream.app.http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpSourceKafkaApplication.class, args);
	}
}
