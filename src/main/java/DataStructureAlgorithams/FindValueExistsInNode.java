package DataStructureAlgorithams;

public class FindValueExistsInNode {
	public class Node {
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}
	}
	static Node head = null;
	Node tail = null;
	public void addNoddAtEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;			
		}
	}
	
	public boolean checkIfThereIsANodeWithAGivenValue(int value) {
		 
	    Node current = head;
	    while (current != null) {
	        if (current.val == value) {
	            return true;
	        }
	        current = current.next;
	    }
	 
	    //if we end up reaching here , it means there is no node in the linked-list with the given value
	    return false;
	 
	}
	//Lecture #21 Assignment: Java program to add node at the beginning with a given value
	public void addNodeAtTheBeginning(int value) {
	 
	    Node newNode = new Node(value);
	    //case when there's no head
	    if (head == null) {
	        head = newNode;
	        tail = newNode;
	        //case when there happens to be a head already
	    } else {
	        newNode.next = head;
	        head = newNode;
	    }
	}
	
	public void addNodeAtIndex(int val, int index) {
		int count = 1;
		Node current = head;
		while(current != null && count != index - 1) {
			current = current.next;
			count++;
		}
		Node newNode = new Node(val);
		Node temp = current.next;
		current.next = newNode;
		newNode.next = temp;
	}
	
	public void removeNodeAtTheBeginning() {
	    
	        //make the next node of current head as the head
	        head = head.next;
	 
	}
	
	public void removeNodeAtTheEnd() {
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		tail = current;
	}
	

	
	public void removeNodeAtIndex(int val, int index) {
		int count = 1;
		Node current = head;
		while(current != null && count != index - 1) {
			current = current.next;
			count++;
		}
		current.next = current.next.next;
	}
	
	public void deleteNodeWithAGivenValue(int val) {
		if (head.val == val) {
	        removeNodeAtTheBeginning();
	    } else if (tail.val == val) {
	        //case when we need to remove the tail node
	        removeNodeAtTheEnd();
	    } else {
	    	Node current = head;
	        Node previous = null;
	        while (current != null && current.val != val) {
	            //store the value of current in previous
	            previous = current;
	            current = current.next;
	        }
	      //case when the given value node  is not found
	        if (current == null) {
	            //throw new RuntimeException("the node with the given value is not found!!");
	        	System.out.println("Given value:" + val + " is no found");
	        }
	        //previous.next = current.next;
	    }
	}

	public void printLinkedList(Node headNode) {
		Node current = headNode;
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
		
	}
	//private void getLinkedListSize(head) {
		//System.out.println();
	//}
	
	public void deleteAllNodesWithEvenValues() {
		 
	    Node current = head;
	    while (current != null) {
	 
	        if (current.val % 2 == 0) {
	            deleteNodeWithAGivenValue(current.val);
	        }
	        current = current.next;
	    }
	}
	
	public void reverseLinkedList() {
		Node prev = null;
		Node next = null;
		Node curr = head;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		printLinkedList(prev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindValueExistsInNode ll = new FindValueExistsInNode();
		/**int[] createNode = {12,10,56};
		for (int i : createNode) {
			ll.addNoddAtEnd(i);	
		}**/
		ll.addNoddAtEnd(3);
		ll.addNoddAtEnd(50);
		ll.addNoddAtEnd(5);
		
		/**int findVal = 10;
		if(ll.checkIfThereIsANodeWithAGivenValue(findVal)) {
			System.out.println("given value is exists in the Node:" + findVal);
		} else {
			System.out.println("Given value is not exists in he given list:" + findVal);
		}**/
		
		ll.printLinkedList(head);
		/*System.out.println("-------Linked list---------"+ll.getLinkedListSize(head));
		ll.addNodeAtTheBeginning(75);		
		ll.printLinkedList(head);
		System.out.println("-------Added Node at the end---------");
		ll.removeNodeAtTheEnd();		
		ll.printLinkedList(head);
		System.out.println("-------Removed end of the Node---------");
		ll.addNodeAtIndex(63, 2);		
		ll.printLinkedList(head);
		System.out.println("-------Added Node at the index---------");
		ll.removeNodeAtTheBeginning();		
		ll.printLinkedList(head);
		System.out.println("-------Removed Beginning of the Node---------");
		ll.addNodeAtTheBeginning(80);
		System.out.println("-------Added node Beginning of the Node: 80---------");
		ll.removeNodeAtIndex(45, 2);
		ll.printLinkedList(head);
		System.out.println("-------Removed Node from the mentioned index---------");
		ll.deleteNodeWithAGivenValue(80);
		ll.printLinkedList(head);
		System.out.println("-------Removed Node with given value---------");
		ll.deleteAllNodesWithEvenValues();
		ll.printLinkedList(head);
		System.out.println("-------Removed all even values---------");*/
		ll.reverseLinkedList();
	}

	private String getLinkedListSize(Node head2) {
		// TODO Auto-generated method stub
		return null;
	}

}
