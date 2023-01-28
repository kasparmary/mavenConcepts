package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

import com.google.common.collect.Iterators;

public class LinkedListExamples {

	
	public void linkedListUsingIterator() {
		LinkedList<String> lls = new LinkedList<String>();
		System.out.println(lls.size());
		Iterator<String> i = lls.iterator();
		System.out.println(Iterators.size(i));
		while(i.hasNext()) {
			System.out.println("empty Linkedlist");
		}
	}

	public void linkedListExample() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(3);
		ll.add(6);
		ll.add(1);
		ll.add(3);
		ll.add(2);
		System.out.println(ll);
		System.out.println("Get first element" + ll.getFirst());
		System.out.println("Get last element" + ll.getLast());
		System.out.println("Get element by index" + ll.get(0));
		System.out.println("Remove first elemet" + ll.removeFirst());
		System.out.println("Remove last elemet" + ll.removeLast());
		System.out.println("Remove element by index" + ll.remove(1));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExamples ll = new LinkedListExamples();
		//ll.linkedListExample();
		ll.linkedListUsingIterator();
	}

}
