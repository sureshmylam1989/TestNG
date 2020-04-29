package com.testNG.Interface;

import org.testng.annotations.Test;

public class InterfaceTestNGClass implements TestInterface{
  @Test
  public void interfaceTestNGMethod() {
	  System.out.println("Interface TestNG Method");
  }
}
