/*
 * @author:ReturnOfTheKing
 * 
 * 234. Palindrome Linked List
 * 
 * 1.快慢指针，注意奇数和偶数的区别。
 */
package LeetCode;

public class LeetCode_234 {
	//1.转置链表然后比较，不知为何一直报错，可能只要转置了就一定会破坏原有结构，不懂为何用另一个变量存储也不奏效。
//    public ListNode reverse(ListNode p) {
//        ListNode n=null;
//        ListNode head=p;
//        while(null!=head)
//        {
//            ListNode tem=head.next;
//            head.next=n;
//            n=head;
//            head=tem;
//        }
//        return n;
//    }
//    public boolean isPalindrome(ListNode head) {
//        ListNode n=reverse(head);
//        while(head!=null)
//        {
//            if(head.val==n.val)
//            {
//                head=head.next;
//                n=n.next;
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	    public ListNode reverse(ListNode p) {
	        ListNode n=null;
	        ListNode head=p;
	        while(null!=head)
	        {
	            ListNode tem=head.next;
	            head.next=n;
	            n=head;
	            head=tem;
	        }
	        return n;
	    }
	    public boolean isPalindrome(ListNode head) {
	        ListNode f=head;
	        ListNode s=head;
	        while(f!=null&&f.next!=null)
	        {
	            f=f.next.next;
	            s=s.next;
	        }
	        if(f!=null)
	        {
	            s=s.next;
	        }
	        s=reverse(s);
	        f=head;
	        while(s!=null)
	        {
	            if(s.val!=f.val)
	            {
	                return false;
	            }
	            s=s.next;
	            f=f.next;
	        }
	        return true;
	    }
	 
}
