package com.testNG.inheritence;

import org.testng.annotations.Test;

public class SubClass extends SuperClass{
  @Test
  public void subClassMethod() {
	  System.out.println("This is sub class");
  }
}
