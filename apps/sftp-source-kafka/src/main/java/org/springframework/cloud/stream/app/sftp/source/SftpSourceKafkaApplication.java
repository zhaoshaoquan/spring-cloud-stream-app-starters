package org.springframework.cloud.stream.app.sftp.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SftpSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SftpSourceKafkaApplication.class, args);
	}
}
