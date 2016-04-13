package org.springframework.cloud.stream.app.websocket.sink.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketSinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketSinkKafkaApplication.class, args);
	}
}
