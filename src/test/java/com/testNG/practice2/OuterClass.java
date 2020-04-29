package com.testNG.practice2;

import org.testng.annotations.Test;

public class OuterClass {
	@Test
	public void OuterTest1() {
		System.out.println("Outer Test1");
	}

	public class InnerClass {
		@Test
		public void InnerTest1() {
			System.out.println("Inner Test1");
		}
	}
}
