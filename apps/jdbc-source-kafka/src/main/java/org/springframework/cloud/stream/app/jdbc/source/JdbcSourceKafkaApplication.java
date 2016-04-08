package org.springframework.cloud.stream.app.jdbc.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcSourceKafkaApplication.class, args);
	}
}
