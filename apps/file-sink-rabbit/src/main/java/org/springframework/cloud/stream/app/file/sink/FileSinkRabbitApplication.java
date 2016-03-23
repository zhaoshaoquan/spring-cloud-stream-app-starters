package org.springframework.cloud.stream.app.file.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileSinkRabbitApplication.class, args);
	}
}
