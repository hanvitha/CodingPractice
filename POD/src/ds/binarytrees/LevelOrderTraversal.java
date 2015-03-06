package ds.binarytrees;

import ds.binarytrees.BinaryTree.Node;

public class LevelOrderTraversal {
/*	
 * Recursive approach: Traversing all heights and printing the elements at the depth.
 * 
 * LevelOrder method is to Travel through all levels until the height of the tree is reached 
 * PrintTraversal method checks whether the targeted depth is reached or not,if reached prints data
 * else goes to next level
 */
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
		LevelOrder(t1.root);
	}

	public static void LevelOrder(Node root) {
		int h = height(root);
		for(int i=1;i<=h;i++){
			PrintTraversal(root, i);
			System.out.println();
		}
	}

	
	//printing all the nodes in the depth d
	private static void PrintTraversal(Node root, int d) {
		if(root==null)
			return;
		if(d ==1){
			System.out.print(root.value+" ");
		}
		PrintTraversal(root.left,d-1);
		PrintTraversal(root.right,d-1);
	}
	//finding the height of the tree.Maxheight among left and right subtrees is added
	private static int height(Node root) {
		if(root == null)
			return 0;
		
		else{
			int lh=height(root.left);
			int rh=height(root.right);
			if(lh>rh){
				return lh+1;
			}
			else{
				return rh+1;
			}
		}
	}


}
