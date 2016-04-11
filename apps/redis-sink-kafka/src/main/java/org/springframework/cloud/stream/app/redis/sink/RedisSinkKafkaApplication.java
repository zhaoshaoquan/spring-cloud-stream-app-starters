package org.springframework.cloud.stream.app.redis.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSinkKafkaApplication.class, args);
	}
}
