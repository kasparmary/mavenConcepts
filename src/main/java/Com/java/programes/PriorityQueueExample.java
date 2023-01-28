package Com.java.programes;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pri = new PriorityQueue<>();
		pri.add(5);
		pri.add(2);
		pri.add(3);
		
		System.out.println(pri);
		// Using the remove() method
        boolean result = pri.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number = pri.poll();
        System.out.println("Removed Element Using poll(): " + number);
	}

}
