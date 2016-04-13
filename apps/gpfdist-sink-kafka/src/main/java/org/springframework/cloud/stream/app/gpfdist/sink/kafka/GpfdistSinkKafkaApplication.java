package org.springframework.cloud.stream.app.gpfdist.sink.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GpfdistSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpfdistSinkKafkaApplication.class, args);
	}
}
