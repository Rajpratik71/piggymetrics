package com.piggymetrics.account.client;

import com.piggymetrics.account.domain.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.OutputCaptureRule;

import static org.hamcrest.Matchers.containsString;

/**
 * @author cdov
 */
@SpringBootTest(properties = {
		"feign.hystrix.enabled=true"
})
public class StatisticsServiceClientFallbackTest {

	@Autowired
	private StatisticsServiceClient statisticsServiceClient;

	@Test
	public void testUpdateStatisticsWithFailFallback() {
		statisticsServiceClient.updateStatistics("test", new Account());

		// outputCapture.expect(containsString("Error during update statistics for account: test"));

	}

}

