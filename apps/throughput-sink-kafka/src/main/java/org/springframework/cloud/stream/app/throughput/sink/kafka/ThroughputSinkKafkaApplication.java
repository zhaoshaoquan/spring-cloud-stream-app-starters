package org.springframework.cloud.stream.app.throughput.sink.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThroughputSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThroughputSinkKafkaApplication.class, args);
	}
}
