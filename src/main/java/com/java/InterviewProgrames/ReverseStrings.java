package com.java.InterviewProgrames;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "Hellomary";
		
		//print normal way
		for(int i=0; i<aa.length(); i++) {
			System.out.println(aa.charAt(i));
		}
		System.out.println("===========");
		//print normal way
		for(int i=aa.length()-1; i>=0; i--) {
			System.out.print(aa.charAt(i));
		}

	}

}
