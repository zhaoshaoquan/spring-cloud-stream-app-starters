package org.springframework.cloud.stream.app.bridge.processor.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BridgeProcessorKafkaApplication.class, args);
	}
}
