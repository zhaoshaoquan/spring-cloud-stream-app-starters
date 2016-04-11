package org.springframework.cloud.stream.app.hdfs.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfsSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfsSinkKafkaApplication.class, args);
	}
}
