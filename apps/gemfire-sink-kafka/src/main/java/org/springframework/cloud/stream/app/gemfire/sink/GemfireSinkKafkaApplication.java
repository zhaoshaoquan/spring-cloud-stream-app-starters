package org.springframework.cloud.stream.app.gemfire.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GemfireSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemfireSinkKafkaApplication.class, args);
	}
}
