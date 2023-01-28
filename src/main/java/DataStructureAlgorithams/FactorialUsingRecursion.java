package DataStructureAlgorithams;

public class FactorialUsingRecursion {

	static int n =4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = fatorial(n);
		System.out.println(sum);
		int fibo = fib(7);
		System.out.println(fibo);
	}
	private static int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	private static int fatorial(int n2) {
		if (n2 == 1)
			return 1;
		return n2 * fatorial(n2 - 1);
		
	}
	
	

}
