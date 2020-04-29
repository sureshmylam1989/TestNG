package com.dataprovideTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int counter = 0;
	int retryAttempt = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (counter < retryAttempt) {
			counter++;
			return true;
		} else {
			return false;
		}
	}
}
