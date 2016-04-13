package org.springframework.cloud.stream.app.jdbc.source.rabbit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JdbcSourceRabbitApplication.class)
public class JdbcSourceRabbitApplicationTests {

	@Test
	public void contextLoads() {
	}

}
