package com.java.abstraction;

public class Benz extends Car implements UpcomingProjects{

	@Override
	public void engineSecret() {
		System.out.println("Benz Engine secret");
	}
	
	@Override
	public void companyVault() {
		System.out.println("Benz company vault");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Benz();
		car.engineSecret();
		car.companyVault();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}
