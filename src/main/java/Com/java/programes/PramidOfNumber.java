package Com.java.programes;

import java.util.Scanner;

public class PramidOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 1;
		int temp1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pramid size");
		int no = sc.nextInt();
		for (int i = 0; i<=no; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
		
		System.out.println("=================");
		for (int i = 0; i<=no; i++) {
			for (int j = i; j<=no; j++) {
				System.out.print(temp1 + " ");
				temp1+=1;
			}
			System.out.println();
		}
	}

}
