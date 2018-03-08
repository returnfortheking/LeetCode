/*
 * @author:ReturnOfTheKing
 * 
 * 83. Remove Duplicates from Sorted List
 * 
 * 1.主要注意排除head为null和只有一项的情况
 */
package LeetCode;

public class LeetCode_83 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)//不写这个的话会陷入死循环
        {
            return head;
        }
        ListNode p=head;
        while(p.next!=null)
        {
            if(p.val==p.next.val)
            {
                p.next=p.next.next;
            }else{
                p=p.next;
            }
        }
        return head;
    }
}
