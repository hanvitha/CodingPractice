package ds.binarytrees;

import ds.binarytrees.BinaryTree.Node;

public class LevelOrderSpiral {

	public static void main(String[] args) {
		LevelOrderSpiral l1 = new LevelOrderSpiral();
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
		l1.spiralLevelOrder(t1.root);
	}

	private void spiralLevelOrder(Node node) {
		Stack left = new Stack(node);
		Stack right = new Stack();
		Node leftNode = left.pop();
		Node rightNode = right.pop();
		while (leftNode != null || rightNode != null) {
			while (leftNode != null) {
				System.out.print(leftNode.value + "  ");
				if (leftNode.right != null)
					right = right.push(leftNode.right);
				if (leftNode.left != null)
					right = right.push(leftNode.left);
				leftNode = left.pop();
			}
			System.out.println();
			rightNode = right.pop();
			while (rightNode != null) {
				System.out.print(rightNode.value + "  ");
				if (rightNode.left != null)
					left = left.push(rightNode.left);
				if (rightNode.right != null)
					left = left.push(rightNode.right);
				rightNode = right.pop();
			}
			System.out.println();
			leftNode = left.pop();
		}
	}

}
