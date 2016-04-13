package org.springframework.cloud.stream.app.tcp.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TcpSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcpSinkRabbitApplication.class, args);
	}
}
