package Com.java.programes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to do factorial:");
		int n = sc.nextInt();
		int fac = n, fac1 = n;
		for(int i = (n-1); i>1; i--) {
			System.out.println(i+"---"+fac);
			fac = fac * i;
		}
		System.out.println("Factorial no is:" + fac);
		
		for(int j = 2; j<n; j++) {
			System.out.println(j+"---"+fac1);
			fac1 = fac1 * j;
		}
		System.out.println("Factorial no is:" + fac1);
	}

}
