package com.java.core;

public class NoArgsConstructor {

	String name;
	int id;
	
	NoArgsConstructor() {
		name = "Joshua";
		id = 24;
		System.out.println(" No Argument constructor get called when object initialixed");
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgsConstructor noArg = new NoArgsConstructor();
	}

}
