package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public void basicExamplesHashSet(){
		HashSet<String>hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A"); // the return type of add() is boolean. Since A is already there it will return false and wont add
		hashSet.add(null);
		hashSet.add("C");
		hashSet.add("B");
		hashSet.add("B");
		//We have no control on insertion order
		System.out.println("Contents of the HashSet :"+ hashSet);
	}

	/*
	 * Iterate using Iterator 
	 */
	
	public void iterateUsingIterator(){
		HashSet<String>hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("B");
		
		Iterator< String> iterator= hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println("Elements of HashSet :"+ iterator.next());
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample hashSetExample= new HashSetExample();
		hashSetExample.basicExamplesHashSet();
		hashSetExample.iterateUsingIterator();
	}
}
