package org.springframework.cloud.stream.app.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileSourceKafkaApplication.class, args);
	}
}
