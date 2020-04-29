package com.runner.testNG;

import org.testng.TestNG;

public class TestNG_ExecutableJar {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {TestCases.class});
		testng.run();
	}
}
