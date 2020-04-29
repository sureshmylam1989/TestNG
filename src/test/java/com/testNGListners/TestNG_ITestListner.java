package com.testNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_ITestListner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test is started and context"+ context);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test is ended and context"+ context);
		
	}

}
