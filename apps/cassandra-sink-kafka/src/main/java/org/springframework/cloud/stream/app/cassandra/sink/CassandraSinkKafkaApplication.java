package org.springframework.cloud.stream.app.cassandra.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CassandraSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraSinkKafkaApplication.class, args);
	}
}
