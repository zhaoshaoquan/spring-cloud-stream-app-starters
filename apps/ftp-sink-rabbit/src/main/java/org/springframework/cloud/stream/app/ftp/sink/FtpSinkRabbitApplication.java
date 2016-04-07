package org.springframework.cloud.stream.app.ftp.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FtpSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtpSinkRabbitApplication.class, args);
	}
}
