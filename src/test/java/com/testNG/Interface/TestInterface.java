package com.testNG.Interface;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public interface TestInterface {
	
//	@BeforeTest
//	public void interfaceBeforeTest1();
	
	@Test
	public static void interfaceTest1(){
		System.out.println("static method");
	}
	
	@Test
	public default void interfaceTest2(){
		System.out.println("default method");
	}

	
//	@AfterTest
//	public void interfaceAfterTest1();
}
