package org.springframework.cloud.stream.app.hdfs.dataset.sink.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfsDatasetSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfsDatasetSinkRabbitApplication.class, args);
	}
}
