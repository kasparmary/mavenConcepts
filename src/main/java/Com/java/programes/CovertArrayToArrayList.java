package Com.java.programes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CovertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] aa = {2,4,1,5,9,3,6};
		System.out.println(aa.length);
		
		//way1
		List<Integer> way1 = Arrays.asList(aa);
		System.out.println(way1);
		
		//way2
		List<Integer> way2 = new ArrayList<Integer>();
		Collections.addAll(way2, aa);
		System.out.println(way2);
		
		//way3
		List<Integer> way3 = new ArrayList<Integer>();
		for (Integer integer : aa) {
			way3.add(integer);
		}
		System.out.println(way3);
	}

}
