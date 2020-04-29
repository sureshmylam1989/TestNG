package com.annotationTransformer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	int count =0;
	int Max = 3;

	@Override
	public boolean retry(ITestResult result) {
		if(count<Max) {
			count++;
			return true;
		}else {
			return false;
		}
	}

}
