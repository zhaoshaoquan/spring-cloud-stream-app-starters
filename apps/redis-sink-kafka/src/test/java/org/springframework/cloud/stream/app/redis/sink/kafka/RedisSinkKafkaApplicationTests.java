package org.springframework.cloud.stream.app.redis.sink.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RedisSinkKafkaApplication.class)
public class RedisSinkKafkaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
