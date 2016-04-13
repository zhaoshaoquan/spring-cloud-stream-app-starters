package org.springframework.cloud.stream.app.tcp.sink.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TcpSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcpSinkKafkaApplication.class, args);
	}
}
