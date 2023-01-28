package DataStructureAlgorithams;

import java.util.Stack;

public class InsertValueInStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(12);
		stack1.push(56);
		stack1.push(50);
		System.out.println(stack1);
		System.out.println();
		insertInTheMiddle(1, 48, stack1);
	}
	
	public static void 	insertInTheMiddle(int index, int value, Stack<Integer> s)
	{
		Stack<Integer> temp = new Stack<Integer>();
		for(int i =1; i<= s.size()-index+1;i++)
		{
			int item = s.peek();
			temp.push(item);
			s.pop();
		}
		s.push(value);
		while(!temp.empty())
		{
			int item =temp.peek();
			s.push(item);
			temp.pop();
		}
		System.out.println(s);
	}

}
