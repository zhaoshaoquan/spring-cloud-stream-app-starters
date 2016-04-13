package org.springframework.cloud.stream.app.counter.sink.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterSinkKafkaApplication.class, args);
	}
}
