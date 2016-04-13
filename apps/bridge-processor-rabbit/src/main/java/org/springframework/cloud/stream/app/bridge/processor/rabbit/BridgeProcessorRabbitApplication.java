package org.springframework.cloud.stream.app.bridge.processor.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeProcessorRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(BridgeProcessorRabbitApplication.class, args);
	}
}
