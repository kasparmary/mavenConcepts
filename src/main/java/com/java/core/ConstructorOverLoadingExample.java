package com.java.core;

public class ConstructorOverLoadingExample {
	String name;

	ConstructorOverLoadingExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Data Object Created");
	}
	
	ConstructorOverLoadingExample(String myName) {
		 name = myName;
		System.out.println("Give name is :" + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverLoadingExample overLoadEx = new ConstructorOverLoadingExample();
		
		ConstructorOverLoadingExample overLoadEx1 = new ConstructorOverLoadingExample("Kaspar");

	}

}
