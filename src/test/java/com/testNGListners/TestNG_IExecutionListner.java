package com.testNGListners;

import org.testng.IExecutionListener;

public class TestNG_IExecutionListner implements IExecutionListener{

	@Override
	public void onExecutionStart() {
		System.out.println("TestNG execution start");
		
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("TestNG execution end");
		
	}

}
