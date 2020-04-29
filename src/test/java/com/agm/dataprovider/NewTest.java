package com.agm.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	@Test(dataProvider = "dataContainer", dataProviderClass = DataProvider1.class)
	public void method1(String param1) {
		System.out.println("Param1 is : " + param1);
	}
}
