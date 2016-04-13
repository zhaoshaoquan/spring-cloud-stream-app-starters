package org.springframework.cloud.stream.app.sftp.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SftpSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SftpSinkRabbitApplication.class, args);
	}
}
