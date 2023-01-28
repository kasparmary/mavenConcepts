package DataStructureAlgorithams;

public class Recursion1 {

	 static int[] arr = {12, 5, 4, 6 ,78};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(arr.length-1));
	}
	private static int sum(int i) {
		// TODO Auto-generated method stub
		if (i == 0)
			return arr[i];
		return arr[i] + sum(i-1);
	}
	

}
