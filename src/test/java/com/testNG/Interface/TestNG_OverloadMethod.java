package com.testNG.Interface;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_OverloadMethod {
  @Test
  public void f() {
	  System.out.println("no str");
  }
  
  @Test(dataProvider="dp")
  public void f(String str,int x) {
	  System.out.println("Str is:"+ str+ x);
  }
  

  
  @Parameters({"str1","str2"})
  @Test
  public void f(String str,String str2) {
	  System.out.println("Str1 is:"+ str + "and str2 is "+ str2);
  }
  
  @DataProvider(name = "dp")
  public Object[][] dataprovider(){
	return new Object[][] {{"suresh","5"}};
	  
  }
}
