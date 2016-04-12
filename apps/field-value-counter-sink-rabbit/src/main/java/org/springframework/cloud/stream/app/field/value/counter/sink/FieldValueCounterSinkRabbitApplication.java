package org.springframework.cloud.stream.app.field.value.counter.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FieldValueCounterSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FieldValueCounterSinkRabbitApplication.class, args);
	}
}
