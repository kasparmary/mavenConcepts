package com.java.abstraction;

public class Bmw extends Car implements UpcomingProjects, Interface2, Interface3{

	@Override
	public void engineSecret() {
		System.out.println("BMW Engine secret");
	}
	
	@Override
	public void companyVault() {
		System.out.println("BMW company vault");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Bmw(); //Dynamic polymarphism, Base class reference, derived class object
		car.engineSecret();
		car.companyVault();
			
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("BMW method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("BMW method2");		
	}

}
