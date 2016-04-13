package org.springframework.cloud.stream.app.twitterstream.source.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterstreamSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterstreamSourceKafkaApplication.class, args);
	}
}
