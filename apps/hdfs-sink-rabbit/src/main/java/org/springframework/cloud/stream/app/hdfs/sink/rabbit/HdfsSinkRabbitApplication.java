package org.springframework.cloud.stream.app.hdfs.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfsSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfsSinkRabbitApplication.class, args);
	}
}
