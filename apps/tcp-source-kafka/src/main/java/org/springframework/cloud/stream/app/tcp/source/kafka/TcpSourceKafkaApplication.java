package org.springframework.cloud.stream.app.tcp.source.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TcpSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcpSourceKafkaApplication.class, args);
	}
}
