package linkedlists;

public class RemoveLoopInTheList {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.Enqueue(1); l1.Enqueue(2); l1.Enqueue(3); l1.Enqueue(4); l1.Enqueue(5); l1.Enqueue(6); l1.Enqueue(7); l1.Enqueue(8); l1.Enqueue(9); 
		int rand = (int) (Math.random()*10);
		Node lastNode = l1.head;
		while(lastNode.next!=null){
			lastNode= lastNode.next;
		}
		Node temp = l1.head;
		while(rand>1){
			temp = temp.next;
			rand--;
		}
		lastNode.next=temp;
		
		l1.head= RemoveLoop(l1.head);
		l1.display();
	}

	private static Node RemoveLoop(Node head) {
		Node t1 = head; 
		Node t2 = head;
		while(t1!=null && t2!=null && t2.next!=null){
			t1=t1.next;
			t2 = t2.next.next;
			if(t1==t2){
				//loop exists!!
				int k=1;
				while(t1.next!=t2){
					t1=t1.next;
					k++;
				}
				System.out.println( "k --->>"+k);
				t1 = head;
				t2 = head;
				for(int i=0;i<k;i++){
					t2 =t2.next;
				}
				Node prev = null;
				//complete circular linked list
				if(t1==t2){
					t2=t2.next;
					while(t1!=t2){
						prev = t2;
						t2 = t2.next;
					}
				}
				while(t1!=t2){
					t1 = t1.next;
					prev = t2;
					t2 = t2.next;
				}
				prev.next = null;
				return head;
			}
		}
		
		return head;
	}

}
