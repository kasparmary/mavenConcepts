package Com.java.programes;

import java.util.Scanner;

public class REverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Reverse:- ");
		String str = sc.nextLine();
		int i = str.length();
		//StringBuffer strb = new StringBuffer();
		String rev="";
		for (int j = i-1; j >= 0; j--) {
			//strb = strb.append(str.charAt(j));
			rev = rev + str.charAt(j);
		}

		System.out.println(rev);
	}

}
