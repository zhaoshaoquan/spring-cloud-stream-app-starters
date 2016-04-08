package org.springframework.cloud.stream.app.gemfire.sink;

import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.client.Pool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.stream.test.binder.TestSupportBinderAutoConfiguration;
import org.springframework.data.gemfire.client.Interest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static junit.framework.TestCase.assertNull;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author David Turanski
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {GemfireSink.class,
		PropertyPlaceholderAutoConfiguration.class,
		TestSupportBinderAutoConfiguration.class})
@IntegrationTest({"regionName=Stocks", "keyExpression='key'",
		"hostAddresses=localhost:42424", "connectType=server"})
@EnableConfigurationProperties(GemfireSinkProperties.class)
public class GemfireSinkConfigurationTests {

	@Resource(name="clientRegion")
	private Region region;

	@Autowired
	private  Pool pool;

	@Autowired(required=false)
	private Interest<?> interest;

	@Test
	public void testDefaultConfiguration() {
		assertNull("interest should be null", interest);
		assertThat("subscriptions should not be enabled",!pool.getSubscriptionEnabled());
	}
}
