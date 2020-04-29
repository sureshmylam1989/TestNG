package com.testNGListners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestNG_IInvokedMethodListener implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("start - InvokeMethod Listener"+ method+ testResult);
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("End - InvokeMethod Listener"+ method+ testResult);
		
	}

}
