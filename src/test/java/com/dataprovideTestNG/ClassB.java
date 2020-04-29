package com.dataprovideTestNG;

import org.testng.annotations.Test;

public class ClassB {
	@Test(priority=1)
	  public void B1() {
		  System.out.println("B1");
	  }
	  
	  @Test(priority=2)
	  public void B2() {
		  System.out.println("B2");
	  }
	  
	  @Test(priority=3)
	  public void B3() {
		  System.out.println("B3");
	  }
}
