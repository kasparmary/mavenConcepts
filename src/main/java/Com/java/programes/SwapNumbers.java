package Com.java.programes;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		//way1
		System.out.println("Before Swaping");
		System.out.println("a =" + a);
		System.out.println("b = " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swaping");
		System.out.println("a =" + a);
		System.out.println("b = " + b);
		
		System.out.println("===========Way2==========");
		int c = -200;
		int d = 34;
		
		c = c+d;
		d = c-d;
		c = c-d;
		System.out.println("After Swaping");
		System.out.println("c =" + c);
		System.out.println("d = " + d);
		
//		first = first+second;
//		second=first-second;
//		first=first-second;
		
		
	}

}
