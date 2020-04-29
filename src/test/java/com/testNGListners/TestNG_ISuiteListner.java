package com.testNGListners;

import org.testng.IExecutionListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestNG_ISuiteListner implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("suite started");		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("suite ended");		
	}



}
