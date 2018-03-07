/*
 * @author:ReturnOfTheKing
 * 
 * 206. Reverse Linked List
 * 
 * 1.递归和迭代
 */
package LeetCode;

public class LeetCode_206 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode reverseList1(ListNode head) {
        ListNode n=null;
        while(null!=head)
        {
            ListNode tem=head.next;
            head.next=n;
            n=head;
            head=tem;
        }
        return n;
    }
}
