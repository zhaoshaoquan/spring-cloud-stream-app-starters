package org.springframework.cloud.stream.app.router.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RouterSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouterSinkRabbitApplication.class, args);
	}
}
