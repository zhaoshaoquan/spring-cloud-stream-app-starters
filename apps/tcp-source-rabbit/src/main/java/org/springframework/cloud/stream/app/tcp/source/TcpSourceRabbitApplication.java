package org.springframework.cloud.stream.app.tcp.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TcpSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcpSourceRabbitApplication.class, args);
	}
}
