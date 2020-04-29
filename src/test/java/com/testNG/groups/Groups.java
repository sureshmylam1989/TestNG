package com.testNG.groups;

import org.testng.annotations.Test;

public class Groups {
	// A test method belongs to Group G1
	@Test(groups = { "G1" })
	public void G1Method1() {
		System.out.println("G1Method1");
	}

	// A test method belongs to Group G1
	@Test(groups = { "G1"})
	public void G1Method2() {
		System.out.println("G1Method2");
	}

	// A test method belongs to Group G2
	@Test(groups = { "G3" })
	public void G2Method1() {
		System.out.println("G2Method1");
	}

	 // A test method belongs to Group G2
	 @Test(groups = { "G4"})
	 public void G2Method2() {
	 System.out.println("G2Method2");
	 }
	
	 // A test method belongs to Group G3
	 @Test(groups = { "G5" })
	 public void G3Method1() {
	 System.out.println("G3Method1");
	 }
	
	 // A test method belongs to Group G3
	 @Test(groups = { "G6" })
	 public void G3Method2() {
	 System.out.println("G3Method2");
	 }
}
