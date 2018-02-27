package niuke;

import org.junit.Test;
public class class_14 {
	public ListNode FindKthToTail(ListNode head, int k) {
		int length = 0;
		ListNode curr = head;
		while(curr!=null){
			length++;
			curr=curr.next;
		}
		if(k>length) return null;
		curr = head;
		for(int i=0;i<length-k;i++){
			curr = curr.next;
		}
		return curr;
	}
	@Test
	public void test(){
		System.out.println("helloworld");
	}
}
