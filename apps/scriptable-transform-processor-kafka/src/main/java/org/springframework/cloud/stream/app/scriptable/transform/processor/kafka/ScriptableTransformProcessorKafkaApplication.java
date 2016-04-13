package org.springframework.cloud.stream.app.scriptable.transform.processor.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScriptableTransformProcessorKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScriptableTransformProcessorKafkaApplication.class, args);
	}
}
