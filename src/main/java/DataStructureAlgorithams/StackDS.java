package DataStructureAlgorithams;

import java.util.Stack;

public class StackDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1 = new Stack<Integer>();
		//Stack<Integer> stack2 = new Stack<Integer>();
		//Stack<Integer> stack3 = new Stack<Integer>();
		Stack<Integer> stack4 = new Stack<Integer>();
		stack1.push(12);
		stack1.push(56);
		stack1.push(50);
		System.out.println(stack1);
//		moveStack(stack1, stack2);
//		moveStack(stack2, stack3);
//		moveStack(stack3, stack1);
		insertValueIntoGivenIndex(stack1, stack4, 1, 45);
		System.out.println(stack1);
	}

	private static void insertValueIntoGivenIndex(Stack<Integer> source, Stack<Integer> dest, int index, int val) {
		int loop = source.size() - index;
		for(int i =1; i<= loop; i++) {
			int item = source.peek();
			System.out.println(item);
			dest.push(item);
			source.pop();		
		}
		source.push(val);
		System.out.println(dest);
		System.out.println(source);
		for(int i =0; i<= dest.size()+1; i++) {
			int item = dest.peek();
			System.out.println(dest.size()+"---"+item);
			source.push(item);
			dest.pop();
		}		
	}

	private static void moveStack(Stack<Integer> source, Stack<Integer> destination) {
		// TODO Auto-generated method stub
		while(!source.isEmpty()) {
			int item=source.peek();
			destination.push(item);
			source.pop();			
		}
		
	}

}
