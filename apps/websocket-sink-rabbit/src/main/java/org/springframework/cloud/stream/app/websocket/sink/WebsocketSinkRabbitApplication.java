package org.springframework.cloud.stream.app.websocket.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketSinkRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketSinkRabbitApplication.class, args);
	}
}
