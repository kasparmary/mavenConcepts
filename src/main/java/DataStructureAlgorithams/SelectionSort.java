package DataStructureAlgorithams;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 1, 6, 2, 8 };
		int temp, minIndex;

		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					temp = arr[j];
					arr[j] = arr[minIndex];
					arr[minIndex] = temp;
					System.out.print(i + "---" + j + "----" + minIndex + "****");
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(arr));
	}

}
