package com.dataprovideTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestMethod extends Retry{
	
	@Test(retryAnalyzer = com.dataprovideTestNG.Retry.class)
	public void Test567() {
		Assert.assertEquals(true, false);
	}

}
