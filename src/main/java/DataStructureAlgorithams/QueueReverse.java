package DataStructureAlgorithams;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
	public static void reverseQueue(Queue<Integer> q) {
		Stack<Integer> ss = new Stack<Integer>();
		while(!q.isEmpty()) {
			ss.push(q.remove());
		}
		while(!ss.isEmpty()) {
			q.add(ss.pop());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(45);
		q.add(12);
		q.add(56);
		q.add(6);
		
		for (Integer ele : q) {
			System.out.println(ele);			
		}
		System.out.println("--after reverse--");
		reverseQueue(q);
		for (Integer ele : q) {
			System.out.println(ele);			
		}
	}

}
