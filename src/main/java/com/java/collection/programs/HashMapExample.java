package com.java.collection.programs;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening"); 
		
		Set sn= hm.entrySet(); 
		Iterator it =sn.iterator(); //hashtable -pass table set collections  
		
		while(it.hasNext()) { 
			System.out.println(it.next()); 
			Map.Entry mp=(Map.Entry)it.next();
			// System.out.println(mp.getKey()); 
			System.out.println(mp.getValue()); 
		}
	}
}
