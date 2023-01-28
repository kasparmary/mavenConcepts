package Com.java.programes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number:");
		try (Scanner ss = new Scanner(System.in)) {
			int no= ss.nextInt();
			int reverseNo = 0;
			
			while(no != 0 ) {
				reverseNo = reverseNo*10;
				reverseNo = reverseNo + (no%10);
				no=no/10;
			}
			System.out.println(reverseNo);
		}
	}

}
