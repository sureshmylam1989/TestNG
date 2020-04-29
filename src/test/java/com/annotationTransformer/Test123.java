package com.annotationTransformer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test123 {

	@Test
	public void test1() {
		System.out.println("test1 is in progress.....");
		Assert.assertEquals(true, false);

	}

	@Test(retryAnalyzer=Retry.class)
	public void test2() {
		System.out.println("test2 is in progress.....");
		Assert.assertEquals(true, false);
	}
}
