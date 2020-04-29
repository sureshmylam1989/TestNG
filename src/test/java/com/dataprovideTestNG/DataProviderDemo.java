package com.dataprovideTestNG;

import org.openqa.grid.internal.TestSession;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@DataProvider(name = "testData")
	public Object[][] dataProvMethod() {
		return new Object[][] { 
			{ "data1","data_1" }, 
			{ "data2","data_2" } 
		};
	}

	@Test(dataProvider = "testData")
	public void test123(String data,String data2) {
		System.out.println(data+ " " + data2);
	}
	
	@Test
	public void test1233() {
		System.out.println("test1233 is running");
	}
}
