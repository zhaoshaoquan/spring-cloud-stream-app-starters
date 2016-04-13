package org.springframework.cloud.stream.app.gpfdist.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GpfdistSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpfdistSinkRabbitApplication.class, args);
	}
}
