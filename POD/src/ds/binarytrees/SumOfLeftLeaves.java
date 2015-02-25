package ds.binarytrees;

import ds.binarytrees.BinaryTree.Node;

public class SumOfLeftLeaves {

	public static void main(String[] args) {
		BinaryTree t1 = new BinaryTree();
		t1.insert(10);
		t1.insert(5);
		t1.insert(15);
		t1.insert(2);
		t1.insert(17);
		t1.insert(3);
		t1.insert(4);
		t1.insert(1);
		t1.insert(-6);
		t1.insert(16);
		t1.insert(14);
		System.out.println(printSumOfLeftLeaves(t1.root,false));
	}

	private static int printSumOfLeftLeaves( Node root,boolean leftFlag) {
		int sum =0;
		if(root==null)
			return 0;
		if(root.left==null &&root.right==null && leftFlag){
			return root.value;
		}
		else{
			return sum + printSumOfLeftLeaves(root.left,true) + printSumOfLeftLeaves(root.right,false);
		}
	}

}
