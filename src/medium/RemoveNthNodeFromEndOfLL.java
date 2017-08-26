package medium;

public class RemoveNthNodeFromEndOfLL {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		RemoveNthNodeFromEndOfLL r = new RemoveNthNodeFromEndOfLL();
		ListNode head = r.new ListNode(1);
		head.next = r.new ListNode(2);
		head.next.next = r.new ListNode(3);
		head.next.next.next = r.new ListNode(4);
		head.next.next.next.next = r.new ListNode(5);
		System.out.println(r.removeNthFromEnd(head, 2));
		System.out.println(head.val + " " + head.next.val + " " + head.next.next.val + " " + head.next.next.next.val);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
		ListNode n1 = start;//slow
		ListNode n2 = start;//fast
		n1.next = head;
		for (int i = 0; i < n + 1; i++)
			n2 = n2.next;
		while(n2!=null){
			n1 = n1.next;
			n2 = n2.next;
		}
		
		n1.next = n1.next.next;
		
		return start.next;
	}
}
