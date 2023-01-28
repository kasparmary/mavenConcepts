package Com.java.programes;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No for Fibonacci series :");

		int n = sc.nextInt();		 
		int t1 = 0, t2 = 1;		 
		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; i++) {
			System.out.print(t1);
			if (i < n ) {
				System.out.print(" + ");
			}
			int sum = t1 + t2;		 
			t1 = t2;
			t2 = sum;
		}
		
		//Find array sum
		System.out.println("");
		int[] a = { 10, 20, 30, 40 };
		int sum = 0;
		for (int arr : a) {
			sum = sum + arr;
		}
		System.out.println("Array Sum: " + sum);

	}

}
