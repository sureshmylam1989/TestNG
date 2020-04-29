package com.readFile;

public class SubClass extends SuperSub{
	public void display() {
		System.out.println("sub class");
	}
	
	public static void main(String[] args) {
		SuperSub super1 = new SubClass();
		super1.display();
		SubClass sub1 = (SubClass)super1;
		sub1.display();		
	}
	
}
