package org.springframework.cloud.stream.app.hdfs.dataset.sink.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfsDatasetSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfsDatasetSinkKafkaApplication.class, args);
	}
}
