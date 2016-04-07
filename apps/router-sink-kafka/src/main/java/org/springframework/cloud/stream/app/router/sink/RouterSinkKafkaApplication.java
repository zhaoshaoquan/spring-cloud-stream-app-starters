package org.springframework.cloud.stream.app.router.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RouterSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouterSinkKafkaApplication.class, args);
	}
}
