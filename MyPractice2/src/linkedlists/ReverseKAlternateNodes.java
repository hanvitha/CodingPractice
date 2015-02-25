package linkedlists;

public class ReverseKAlternateNodes {
//same a reversing linked list except saving the end node and marking its next to the every k+1 th element
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		int k = 4;
		l1.Enqueue(1); l1.Enqueue(2); l1.Enqueue(3); l1.Enqueue(4); l1.Enqueue(5); l1.Enqueue(6); l1.Enqueue(7); l1.Enqueue(8); l1.Enqueue(9);
		l1.head = ReverseKNodes(l1,k);
		l1.display();
	
	}

	private static Node ReverseKNodes(LinkedList l1,int k) {
		if(k<2){
			return l1.head;
		}
		int count =2;
		Node p1 = l1.head;
		Node  headNew = l1.head;
		Node prev=null;
		while(p1.next!=null){
			Node p2 = p1.next;
			Node nextt = p2.next;
			while(count <=k){
					p2.next = p1;
					p1 = p2;
					p2 = nextt;
					nextt =nextt.next;
					if(count == k){
						if(prev==null){
							headNew.next = p2;
							headNew = p1;
						}
						else{
							prev.next.next = p2;
							prev.next = p1;
							prev = p1;
						}
						count=2;
						
						break;
					}
					count++;
			}
			}
		
		return null;
	}

}
