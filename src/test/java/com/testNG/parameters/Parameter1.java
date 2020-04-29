package com.testNG.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	// String param;
	//
	// @Parameters("paramName")
	// public Parameter1(String p1) {
	// param = p1;
	// }

//	@Parameters("paramName")
//	@Test
//	public void method1(String param) {
//		System.out.println("parameter is :" + param);
//	}

	@Parameters("paramName")
	@Test
	public void method2(@Optional("optionalParames") String param) {
		System.out.println("parameter is :" + param);
	}
	@Parameters({"param","param2"})
	@Test
	public void method3(@Optional String param2,Integer param3) {
		System.out.println("String parameter is :" + param2);
		System.out.println("Int parameter is :" + param3);
	}
	
}
