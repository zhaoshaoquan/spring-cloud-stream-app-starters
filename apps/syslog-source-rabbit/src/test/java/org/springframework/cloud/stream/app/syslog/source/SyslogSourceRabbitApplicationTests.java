package org.springframework.cloud.stream.app.syslog.source;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SyslogSourceRabbitApplication.class)
public class SyslogSourceRabbitApplicationTests {

	@Test
	public void contextLoads() {
	}

}
