package org.springframework.cloud.stream.app.syslog.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SyslogSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyslogSourceRabbitApplication.class, args);
	}
}
