package com.java.core;

public class StaticMethodExample {

	public static void method1() {
		System.out.println("Static method1");
	}
	
	public void method2() {
		method1();
		System.out.println("No Static method2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

}
