package ds.binarytrees;


import ds.binarytrees.BinaryTree.Node;
/**
 * 
 * @author KH1496
 *
 */
public class LevelOrderTraversal {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		LevelOrderTraversal l1 = new LevelOrderTraversal();
		BinaryTree t1 = new BinaryTree();
		t1.insert(10);t1.insert(5);t1.insert(15);t1.insert(2);t1.insert(17);t1.insert(3);t1.insert(4);
		t1.insert(1);t1.insert(-6);	t1.insert(16);t1.insert(14);
		
		//LevelOrder(t1.root);
		l1.LevelOrderIterative(t1.root);
	}
/**
 * @param root
 */
	private void LevelOrderIterative(Node root) {
		Queue q1 = new Queue();
		q1.enQueue(root);
		
		int nodesInCurrentQ = 1;
		int nodesInNextQ = 0;
		Node curNode = q1.pop();
		while(curNode!=null){
			nodesInCurrentQ --;
			if(curNode==null)
				break;
			System.out.print("   "+ curNode.value + " ");
			if(curNode.left !=null){
				q1.enQueue(curNode.left);
				nodesInNextQ++;
			}
			if(curNode.right !=null){
				q1.enQueue(curNode.right);
				nodesInNextQ++;
			}
			
			if(nodesInCurrentQ==0){
				System.out.println();
				nodesInCurrentQ = nodesInNextQ;
				nodesInNextQ =0;
			}
			curNode = q1.pop();
		}
	}

	/**
	 *  
	 * @param root
	 */
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
	
public class Queue{

	NodeQueue head ;
	Queue(){
		head= null;
	}
	public void enQueue(Node node){
		if(head == null){
			head = new NodeQueue(node);
		}
		else{
			NodeQueue temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = new NodeQueue(node);
		}
	}
	public Node pop(){
		if(head==null)
			return null;
		else{
			NodeQueue temp = head;
			head = head.next;
			return temp.node;
		}
	}
}

public class NodeQueue{
	Node node;
	NodeQueue next;
	NodeQueue(Node node){
		this.node = node;
		this.next = null;
	}
}


}
