package medium;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

//easier version edited
public class SwapNodes {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		ListNode p = swapPairs(l1);

		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}

	}

	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode newHd = head.next;
		head.next = swapPairs(head.next.next);
		newHd.next = head;

		return newHd;
	}
}
