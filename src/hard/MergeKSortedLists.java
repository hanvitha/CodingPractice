package hard;

import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergeKSortedLists {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);

		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(5);
		l2.next.next = new ListNode(7);
		l2.next.next.next = new ListNode(10);

		ListNode[] l = { l1, l2 };
		System.out.println(System.currentTimeMillis());
		ListNode p = mergeKLists(l);
		System.out.println(System.currentTimeMillis());
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}

	}

	private static ListNode mergeKLists(ListNode[] l) {
		if(l==null||l.length==0)
			return null;
		
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(l.length,new Comparator<ListNode>(){
			@Override
			public int compare(ListNode o1,ListNode o2){
				if(o1.val < o2.val)
					return -1;
				else if(o1.val==o2.val)
					return 0;
				else
					return 1;
			}
		});
		
		ListNode start= new ListNode(0);
		ListNode tail = start;
		
		for(ListNode n:l){
			if(n!=null)
				pq.add(n);
		}
		
		while(!pq.isEmpty()){
			tail.next = pq.poll();
			tail = tail.next;
			
			if(tail.next!=null)
				pq.add(tail.next);
		}
		
		return start.next;
	}

	public static ListNode mergeKLists1(ListNode[] lists) {
		// my ans exceeded time limit
		// if (lists.length == 0)
		// return null;
		// if (lists.length == 1) {
		// return lists[0];
		// }
		//
		// ListNode temp = new ListNode(0);
		// ListNode start = temp.next;
		// int k, minK;
		// int len = lists.length;
		// int i ;
		// do{
		// k = 0;
		// i = len;
		// minK = Integer.MAX_VALUE;
		// while (k < lists.length) {
		// if (lists[k] == null) {
		// i--;
		// } else if (minK == Integer.MAX_VALUE || lists[k].val <
		// lists[minK].val) {
		// minK = k;
		// }
		// k++;
		// }
		// if (minK != Integer.MAX_VALUE) {
		// temp.next = lists[minK];
		// lists[minK] = lists[minK].next;
		// temp = temp.next;
		// if (start == null)
		// start = temp;
		// }
		// }while(i>0);
		// return start;
		return null;
	}
}
