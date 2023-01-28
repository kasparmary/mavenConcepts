package Com.java.programes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aa = new ArrayList<Integer>();
		aa.add(20);
		aa.add(50);
		aa.add(10);
		aa.add(80);
		aa.toArray();
		System.out.println(aa.toArray().length);
		System.out.println(aa.toArray());
	}

}
