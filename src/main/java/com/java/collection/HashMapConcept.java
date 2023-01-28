package com.java.collection;

import java.util.Collections;
import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		System.out.println(marks);
		Collections.sort(marks, Collections.reverseOrder());
	}

}
