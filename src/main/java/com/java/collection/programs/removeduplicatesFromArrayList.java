package com.java.collection.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class removeduplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> one = new ArrayList<String>();
		one.add("mary");
		one.add("Joshua");
		one.add("mary");
		one.add("Anand");
		one.add("joshua");
		
		
		HashSet<String> aa = new HashSet<String>();
		
		
		for (String item : one) {
			aa.add(item);
		}
		System.out.println(aa);
//		Set<String> two = new LinkedHashSet<String>();
//		two.addAll(one);
//		System.out.println(two);
//		one.clear();
//		one.addAll(two);
//		System.out.println(one);
	}

}
