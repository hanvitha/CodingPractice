package ds.binarytrees;

import ds.binarytrees.BinaryTree.Node;

public class Stack {

	NodeStack top ;
	Stack(){
		top = null;
	}
	Stack(Node node){
		top = new NodeStack(node);
	}
	public Stack push(Node node){
		if(top == null){
			top = new NodeStack(node);
		}
		else{
			NodeStack temp = top;
			top = new NodeStack(node);
			top.next = temp;
		}
		return this;
	}
	public Node pop(){
		if(top==null)
			return null;
		
		NodeStack temp =top;
		top = top.next;
		return temp.node;
	}
	public class NodeStack{
		Node node;
		NodeStack next;
		NodeStack(Node node){
			this.node = node;
			this.next = null;
		}
	}
}
