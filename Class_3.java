package niuke;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class Class_3 {
	public ArrayList<Integer> printListFromTailToHead(ListNode_1 listNode) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		try {
			do {
				arr.add(listNode.val);
				listNode = listNode.next;
			} while (listNode != null);
			Collections.reverse(arr);
		} catch (Exception e) {
		} finally {
			return arr;
		}
	}
}

class ListNode_1 {
	int val;
	ListNode_1 next = null;

	ListNode_1(int val) {
		this.val = val;
	}
	
}
