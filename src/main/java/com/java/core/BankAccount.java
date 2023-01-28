package com.java.core;

public class BankAccount {

	int accNumber = 123456674;
	String accName = "Kaspar";
	Integer accBalance = 100000000;
	
	public void getBalance() {
		System.out.println("My Acc Balance is : " + accBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAcc = new BankAccount();
		bankAcc.getBalance();
		System.out.println("Accoutn Name : " + bankAcc.accName);

	}

}
