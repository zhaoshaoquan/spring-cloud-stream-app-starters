package org.springframework.cloud.stream.app.ftp.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FtpSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtpSinkKafkaApplication.class, args);
	}
}
