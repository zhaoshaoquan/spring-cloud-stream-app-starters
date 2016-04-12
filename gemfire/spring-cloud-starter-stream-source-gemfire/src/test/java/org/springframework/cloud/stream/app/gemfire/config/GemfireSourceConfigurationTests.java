package org.springframework.cloud.stream.app.gemfire.config;

import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.client.Pool;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.stream.app.gemfire.source.GemfireSource;
import org.springframework.cloud.stream.app.gemfire.source.GemfireSourceProperties;
import org.springframework.cloud.stream.test.binder.TestSupportBinderAutoConfiguration;
import org.springframework.data.gemfire.client.Interest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author David Turanski
 **/
@RunWith(SpringJUnit4ClassRunner.class)

@SpringApplicationConfiguration(classes = {
		GemfireSource.class,
		PropertyPlaceholderAutoConfiguration.class,
		TestSupportBinderAutoConfiguration.class })
@IntegrationTest({ "regionName=Stocks"})
@EnableConfigurationProperties(GemfireSourceProperties.class)
public class GemfireSourceConfigurationTests {

	@Resource(name = "clientRegion")
	private Region region;

	@Autowired
	private Pool pool;

	@Autowired
	private List<Interest> interests;

	@Test
	@Ignore("No Subscription Servers available")
	public void testDefaultConfiguration() throws InterruptedException {
		assertThat("interests not present", interests.size() >= 1);
		assertThat("subscriptions should be enabled", pool.getSubscriptionEnabled());
	}

}
