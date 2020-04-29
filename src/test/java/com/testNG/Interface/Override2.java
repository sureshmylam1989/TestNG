package com.testNG.Interface;

import org.testng.annotations.Test;

public class Override2 extends Override1 {

	// Overriding super class method
	@Test
	public void f() {
		System.out.println("sub class");
	}
}
