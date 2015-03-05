package ds.binarytrees;

import ds.binarytrees.BinaryTree.Node;

public class MirrorOfBinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(7);
		tree.insert(6);
		tree.insert(9);
		tree.insert(8);
		tree.insert(10);
		//printing before modifying the binary tree
		tree.preorder();
		System.out.println();
		
		tree.root = Mirror(tree.root);
		//printing the mirror of the binary tree
		tree.preorder();
	}

	private static Node Mirror(Node root) {
		if(root==null || (root.left ==null && root.right == null))
			return root;
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		root.left = Mirror(root.left);
		root.right = Mirror(root.right);
		return root;
	}

}
