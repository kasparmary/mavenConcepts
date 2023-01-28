package Com.java.programes;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to verify Prime or not");
		int num = sc.nextInt();
		int number, temp;
		double total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            //total = total + temp*temp*temp;
            total = total + Math.pow(temp, 3);
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");		
	}

}
