package org.springframework.cloud.stream.app.trigger.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TriggerSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriggerSourceKafkaApplication.class, args);
	}
}
