package org.springframework.cloud.stream.app.ftp.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FtpSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtpSourceKafkaApplication.class, args);
	}
}
