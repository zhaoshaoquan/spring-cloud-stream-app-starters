package org.springframework.cloud.stream.app.field.value.counter.sink.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FieldValueCounterSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FieldValueCounterSinkKafkaApplication.class, args);
	}
}
