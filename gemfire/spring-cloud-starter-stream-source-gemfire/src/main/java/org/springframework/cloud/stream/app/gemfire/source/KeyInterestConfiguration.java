package org.springframework.cloud.stream.app.gemfire.source;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.client.Interest;

/**
 * The default client cache configuration is to receive events for all keys.
 * Alternately, the application may provide one or more of your own implementations, e.g.,
 * {@link org.springframework.data.gemfire.client.RegexInterest} if the key type is
 * String. You may also provide multiple beans of this type, e.g., one for each key.
 *
 * @author David Turanski
 **/
@Configuration
@ConditionalOnMissingBean(Interest.class)
public class KeyInterestConfiguration {
	@Bean
	public Interest<?> allKeysInterest() {
		return new Interest<>("ALL_KEYS");
	}
}
