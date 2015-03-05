package ds.binarytrees;

public class BinaryTree { 

	Node root = null;
	public static int maxheight = 0;
	
	public BinaryTree() {
		root = null;
	}
	public static void main(String[] args) {
		BinaryTree Btree = new BinaryTree();
		Btree.insert(5);
		Btree.insert(15);
		Btree.insert(2);
		Btree.insert(6);
		Btree.insert(8);
		Btree.insert(1);
		Btree.preorder();
	}
	
	public void preorder() {
		inorderTrav(root);
	}

	private void inorderTrav(Node root) {
		if(root==null) return;
		
		System.out.print(root.value+" ");
		
		inorderTrav(root.left);
		inorderTrav(root.right);
	}

	public class Node{
		int value;
		Node left;
		Node right;
		Node(int value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	public void insert(int val){
		insertNode(val,root);
	}
	public void insertNode(int val, Node node) {
		if(root==null){
			root=new Node(val);
		}
		else if(node.value == val){
			System.out.println("duplicate element");
			return;
		}
		else if(node.value>val){
			if(node.left==null)
				node.left = new Node(val);
			else
				insertNode(val, node.left);
		}
		else{
			if(node.right == null)
				node.right = new Node(val);
			else
				insertNode(val, node.right);
		}
	}
	

}
