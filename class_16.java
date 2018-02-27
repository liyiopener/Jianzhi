package niuke;

import org.junit.Test;

public class class_16 {
	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode mlist = null;
		if(list1==null) return list2;
		if(list2==null) return list1;
		if(list1.val>=list2.val){
			mlist=list2;
			list2=list2.next;
		}else{
			mlist=list1;
			list1=list1.next;
		}
		ListNode mf=mlist;
		while (list1 != null && list2 != null) {
           if(list1.val>= list2.val){
        	   mlist.next=list2;
        	   list2=list2.next;
        	   mlist=mlist.next;
           }else{
        	   mlist.next=list1;
        	   list1=list1.next;
        	   mlist=mlist.next;
           }
          
		}
		 if(list1!=null){
      		   mlist.next=list1;
         }
		 else{
	      		 mlist.next=list2;
	         }
		return mf;

	}
	@Test
	public void test(){
		ListNode first=new ListNode(1);
		first.next=new ListNode(3);
		first.next.next=new ListNode(5);
		ListNode second=new ListNode(2);
		second.next=new ListNode(4);
		second.next.next=new ListNode(6);
		ListNode mlist=Merge(first, second);
		while(mlist!=null){
			System.out.println(mlist.val);
			mlist=mlist.next;
		}
	}
}
