package org.springframework.cloud.stream.app.scriptable.transform.processor.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScriptableTransformProcessorRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScriptableTransformProcessorRabbitApplication.class, args);
	}
}
