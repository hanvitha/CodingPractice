package programs;

import ds.linkedlists.*;

public class P1_Merge2SortedLL {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.Enqueue(4);
		l1.Enqueue(5);
		l1.Enqueue(7);
		l1.Enqueue(11);
		l1.Enqueue(12);
		
		l2.Enqueue(3);
		l2.Enqueue(4);
		l2.Enqueue(7);
		l2.Enqueue(18);
		l2.Enqueue(20);
		
		l1.head = Merge(l1,l2);
		l1.display();
		
	}

	private static LLNode Merge(LinkedList l1, LinkedList l2) {
		LLNode t1= l1.head;
		LLNode t2= l2.head;
		LLNode head = null;
		LLNode prev = null;
		while(t1!=null && t2 != null){
			if(head == null){
				if(t1.value >t2.value){
					prev = t2;
					t2 = t2.next;
				}
				else {
					prev= t1;
					t1 = t1.next;
				}
				head= prev;
			}
			else{
				if(t1.value >t2.value){
					prev.next = t2;
					prev = t2;
					t2 = t2.next;
				}
				else {
					prev.next = t1;
					prev = t1;
					t1 = t1.next;
				}
			}
		}
		while(t1!=null){
			prev.next = t1;
			prev = t1;
			t1 = t1.next;
		}
		while(t2 != null){
			prev.next = t2;
			prev = t2;
			t2 = t2.next;
		}
		
		return head;
	}
	
}
