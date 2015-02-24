package ds.linkedlists;

public class LinkedList {
	public LLNode head ;
	
	public LinkedList() {
		head = null;
	}


public void display() {
		if(head == null){
			return;
		}
		else{
			LLNode temp = head;
			while(temp!=null){
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}

public void DeQueue() {

	if(head == null){
		return;
	}
	else if(head.next == null){
		System.out.println( head.value);
		head= null;
		return;
	}
	else{
		LLNode temp = head;
		while(temp.next.next!=null){
			temp = temp.next;
		}
		System.out.println(temp.next.value);
		temp.next = null;
		return;
	}
	}


public void Enqueue(int i) {
	LLNode t = new LLNode(i);
	if(head==null){
			head = t;
		}
	else{
		LLNode temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next = t;
	}
	}
}
