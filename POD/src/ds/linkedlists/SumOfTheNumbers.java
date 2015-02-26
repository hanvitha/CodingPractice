package ds.linkedlists;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.Enqueue(2);l1.Enqueue(3);l1.Enqueue(4);
		LinkedList l2 = new LinkedList();
		l2.Enqueue(5);l2.Enqueue(6);l2.Enqueue(7);
		LinkedList l3 = new LinkedList();
		l3.Enqueue(0);l3.Enqueue(3);
		Node t1 = l1.head;
		Node t2 = l2.head;
		Node t3 = l3.head;
		LinkedList result = new LinkedList();
		result.head = FindSumOfLists(t1,t2,t3);
		result.display();
	}

	private static Node FindSumOfLists(Node t1, Node t2, Node t3) {
		LinkedList result = new LinkedList();
		int carry =0;
		while(t1!=null || t2!=null || t3!=null){
			int nodesSum = carry;
			if(t1!=null){
				nodesSum = nodesSum + t1.value;
				t1=t1.next;
			}
			if(t2!=null){
				nodesSum = nodesSum + t2.value;
				t2=t2.next;
			}
			if(t3!=null){
				nodesSum = nodesSum + t3.value;
				t3=t3.next;
			}
			if(nodesSum>=10){
				carry = nodesSum /10;
				nodesSum = nodesSum % 10;
			}
			else{
				carry = 0;
			}
			result.Enqueue(nodesSum);
		}
		if(carry>0){
			result.Enqueue(carry);
		}
		
		return result.head;
	}

}
