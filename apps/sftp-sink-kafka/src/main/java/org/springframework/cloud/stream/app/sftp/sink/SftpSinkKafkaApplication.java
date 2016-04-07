package org.springframework.cloud.stream.app.sftp.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SftpSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SftpSinkKafkaApplication.class, args);
	}
}
