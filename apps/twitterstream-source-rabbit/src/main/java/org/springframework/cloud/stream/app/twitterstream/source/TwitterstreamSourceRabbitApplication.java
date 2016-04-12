package org.springframework.cloud.stream.app.twitterstream.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterstreamSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterstreamSourceRabbitApplication.class, args);
	}
}
