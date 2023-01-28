package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public void arrayListExample() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Kaspar");
		arrayList.add("anand");
		arrayList.add("Joshua");
		arrayList.add("anand");
		System.out.println(arrayList);
		
		//Retrive list element
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.indexOf("anand"));
		System.out.println(arrayList.lastIndexOf("anand"));
		System.out.println(arrayList.indexOf("anands"));
		
		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		anotherList.clear();
		System.out.println(anotherList);
		
		//Remove using index position
		arrayList.remove(0);
		System.out.println(arrayList);
		
		//Remove using value
		arrayList.remove("anand");
		System.out.println(arrayList);
		
		//Add null
		arrayList.add(null);
		System.out.println(arrayList);
		
		//update
		arrayList.set(2, "hello");
		System.out.println(arrayList);
		
		//isEmpty() => return boolean
		System.out.println(arrayList.isEmpty());
		
		//Iterate - using foreach
		System.out.println("--------------using ForEach loop-----------");
		for(String string : arrayList) {
			System.out.println(string);
		}
		
		//using for loop
		System.out.println("--------------using For Loop-----------");
		for(int i = 0; i <arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//using listIterator interface
		System.out.println("--------------using ListIterator-----------");
		ListIterator<String> iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----Using backword--------");
		//ListIterator<String> iteratorPrev = arrayList.listIterator();
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		System.out.println("============Uisnfg Iterator============");
		Iterator<String> iterator1 = arrayList.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample listEX = new ArrayListExample();
		listEX.arrayListExample();
	}

}
