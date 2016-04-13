package org.springframework.cloud.stream.app.sftp.source.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SftpSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SftpSourceRabbitApplication.class, args);
	}
}
