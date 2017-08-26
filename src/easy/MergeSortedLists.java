package easy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergeSortedLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode n = new ListNode(0);
		ListNode start = n.next;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				n.next = l1;
				l1 = l1.next;
			} else {
				n.next = l2;
				l2 = l2.next;
			}
			n = n.next;
			if (start == null)
				start = n;
		}

		while (l1 != null) {
			n.next = l1;
			l1 = l1.next;
			n = n.next;
			if (start == null)
				start = n;
		}
		while (l2 != null) {
			n.next = l2;
			l2 = l2.next;
			n = n.next;
			if (start == null)
				start = n;
		}
		return start;
	}

	public static void main(String[] args) {
		ListNode head =  new ListNode(0);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(6);
		head.next.next.next.next = new ListNode(7);

		ListNode head1 = new ListNode(2);
		head1.next = new ListNode(4);
		head1.next.next = new ListNode(5);
		head1.next.next.next = new ListNode(7);
		head1.next.next.next.next = new ListNode(10);
		ListNode p = mergeTwoLists(head, head1);
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}

}
