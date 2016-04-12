package org.springframework.cloud.stream.app.cassandra.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CassandraSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraSinkRabbitApplication.class, args);
	}
}
