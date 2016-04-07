package org.springframework.cloud.stream.app.ftp.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FtpSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtpSourceRabbitApplication.class, args);
	}
}
