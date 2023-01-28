package com.java.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> treemap = new TreeMap<String, String>();
	    // Add Key-Value pairs to TreeMap
	    treemap.put("Key31", "Pear");
	    treemap.put("Key21", "Apple");
	    treemap.put("Key30", "Orange");
	    treemap.put("Key44", "Papaya");
	    treemap.put("Key25", "Banana");
	    System.out.println(treemap.size());
	    int ll = treemap.size();
	    
	    // Get Set of entries
	    Set set = treemap.entrySet();
	    // Get iterator
	    Iterator it = set.iterator();
	    // Show TreeMap elements
	    System.out.println("TreeMap contains: ");
	    int loop = 1;
	    while(it.hasNext()) {
	    	if (loop == ll) {
		      Map.Entry pair = (Map.Entry)it.next();
		      System.out.print("Key is: "+pair.getKey() + " and ");
		      System.out.println("Value is: "+pair.getValue());
	    	}
		      loop++;
	    }
	}

}
