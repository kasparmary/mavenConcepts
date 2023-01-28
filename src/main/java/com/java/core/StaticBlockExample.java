package com.java.core;

public class StaticBlockExample {

	//A class can have multiple static block, but only one static main method
	
	static {
		System.out.println("Static block 1");
	}
	
	static {
		System.out.println("Static block 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method");
	}

}
