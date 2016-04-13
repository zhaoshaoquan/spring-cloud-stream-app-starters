package org.springframework.cloud.stream.app.counter.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterSinkRabbitApplication.class, args);
	}
}
