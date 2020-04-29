package com.testNGListners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Tests {
	
	@Test
	public void test() {
		System.out.println("test is running");
	}
	
	@Test(priority=0)
	public void test2() {
		System.out.println("test2 is running");
	}
	
	@Test(priority=1)
	public void test3() {
		System.out.println("test3 is running");
	}

}
