package org.springframework.cloud.stream.app.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileSourceRabbitApplication.class, args);
	}
}
