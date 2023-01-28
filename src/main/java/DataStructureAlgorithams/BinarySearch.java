package DataStructureAlgorithams;

public class BinarySearch {

	class Node{
		int value;
		Node left;
		Node right;
		public Node(int val) {
			this.value = val;
		}
	}
	Node root;
	public void insert(int value) {
		root = insertNode(root, value);
	}
	
	public Node insertNode(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.value ) {
			root.left = insertNode(root.left, value);
		} else if (value > root.value ) {
			root.right = insertNode(root.right, value);
		}
		return root;
		
	}
	
	public void sortedOrder() {
		inorderTraverse(root);
	}
	public void inorderTraverse(Node root) {
		if (root != null) {
			inorderTraverse(root.left);
			System.out.println(root.value);
			inorderTraverse(root.right);
		}
	}
	
	public int getMinElement() {
		return minElement(root);
	}
	
	public int minElement(Node root) {
		Node current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.value;
		
	}
	public int getMaxElement() {
		return maxElement(root);
	}
	
	public int maxElement(Node root) {
		Node current = root;
		while (current.right != null) {
			current = current.right;
		}
		return current.value;
		
	}
	public int getHeight() {
		return height(root);
	}
	
	public int height(Node root) {
		if (root == null)
			return -1;
		return 1+ Math.max(height(root.left), height(root.right));
	}
	public boolean getSearch(int val) {
		return search(root, val);
	}
	public boolean search(Node root, int value) {
		if (root == null)
			return false;
		if(value == root.value)
			return true;
		if (value > root.value)
			return search(root.right, value);
		else
			return search(root.right, value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		bs.insert(3);
		bs.insert(6);
		bs.insert(2);
		bs.insert(10);
		bs.insert(12);
		bs.insert(1);
		bs.insert(16);
		bs.sortedOrder(); //Inorder traversal
		System.out.println("------------");
		System.out.println(bs.getMinElement());
		System.out.println("------------");
		System.out.println(bs.getMaxElement());
		System.out.println("------------");
		System.out.println(bs.getHeight());
		System.out.println("------------");
		System.out.println(bs.getSearch(10)); //O(logn)
	}

}
