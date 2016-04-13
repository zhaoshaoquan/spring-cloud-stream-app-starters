package org.springframework.cloud.stream.app.throughput.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThroughputSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThroughputSinkRabbitApplication.class, args);
	}
}
