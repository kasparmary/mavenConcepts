package Com.java.programes;

public class EmptyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {};
		//or
		int[] arr1 = new int[0];
		System.out.println("Array length:" + arr.length);
		System.out.println("Array length:" + arr1.length);
		
		//Two dimentions array initializer
		int[][] arrTwo = {{},{}};
		//or
		int[][] arrTwo1 = new int[0][1];
		System.out.println("Two dimentional Array length:" + arrTwo.length);
		System.out.println("Two dimentional Array length:" + arrTwo1.length);
		
	}

}
