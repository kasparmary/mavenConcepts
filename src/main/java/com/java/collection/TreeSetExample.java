package com.java.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public void treeSetExample(){
		//Creating object
		TreeSet<Integer> treeSet= new TreeSet<Integer>() ;
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(3);
		
		System.out.println("Elements are sorted on ascending order :"+ treeSet);
		
		//first() 
		System.out.println("First element :"+treeSet.first());
		//last()
		System.out.println("Last element :"+treeSet.last());
		//headSet()
		System.out.println("Values lesser than given value"+treeSet.headSet(3));
		//tailSet()
		System.out.println("Values equal to and higher than given value"+treeSet.tailSet(9));
		//subSet()
		System.out.println("Subset values :"+treeSet.subSet(2, 9));
		//comparator()
		System.out.println("Comparator returns null if the sorting is default natural order :"+ treeSet.comparator());
		//Adding null to a non empty tree set causes null pointer excpetion
		//treeSet.add(null);
		/*null can be easily added if the tree set is empty. If there are any elements present, the
		 * comparator will check for the sorting order between the previosly added element and 
		 * the null. Since it compares null with the objects exisiting we are getting NPE.
		 * Same is the case, if we add null first and add other elements, NPE will happen.
		 */
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSetExample treeSetExample= new TreeSetExample();
		treeSetExample.treeSetExample();
	}
}
