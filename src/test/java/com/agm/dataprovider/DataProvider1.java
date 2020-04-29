package com.agm.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	public String str;
	
	public DataProvider1(String tsr) {
		System.out.println("I am parameterized constructor"+ str);
		
	}
	
	
	@DataProvider(name = "dataContainer")
	public static Object[] data() {
		Object[] obj = new Object[3];
		obj[0] = "Make";
		obj[1] = "Model";
		obj[2] = "Year";
		return obj;
	}
}
