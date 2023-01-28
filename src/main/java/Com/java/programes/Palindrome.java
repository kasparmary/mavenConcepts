package Com.java.programes;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int r, temp;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome or not");
		int number = scan.nextInt();
		temp = number;
		while(number > 0) {
			r = number % 10; //get remainder
			sum = (sum*10) + r;
			number = number / 10;
		}
		
		if (temp == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a Palindrome bumber");
		}
		
		//polindrome String
		String input = "ammaa";
		String rev = "";
		boolean f = false;
		for(int i = input.length()-1; i>=0; i--) {
			rev = rev + input.charAt(i);
		}
		
		if (input.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not a palindrome");			
		}
		
	}
}
