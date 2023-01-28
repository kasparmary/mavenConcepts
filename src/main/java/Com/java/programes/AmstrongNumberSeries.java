package Com.java.programes;

import java.util.Scanner;

public class AmstrongNumberSeries {

	static boolean isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0;   
	temp=n;   
	//loop execute until the condition becomes false  
//	while(temp>0)    
//	{   
//		temp = temp/10;   
//		digits++;   
//	}
	for(; temp != 0; temp /= 10, ++digits) {}
	temp = n;   
	
	while(temp>0)   
	{   
		last = temp % 10;   
		//calculates the power of a number up to digit times and add the resultant to the sum variable  
		sum +=  (Math.pow(last, digits));  
		temp = temp/10;   
	}  
	//compares the sum with n  
	if(n==sum) return true; 
	else return false;   
	}   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num=sc.nextInt();  
		System.out.println("Amstrong numbers upto "+ num + " are:");
		for(int i=0; i<=num; i++) {
			if(isArmstrong(i))  
			{  
				System.out.print(i+", ");  
			} 
		}
	}

}
