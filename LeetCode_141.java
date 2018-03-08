/*
 * @author:ReturnOfTheKing
 * 
 * 141. Linked List Cycle
 * 
 * 1.hashset，注意contains方法是带s的
 * 
 * 2.快慢指针，神奇的一比，惊了。
 */
package LeetCode;

import java.util.*;

public class LeetCode_141 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> make=new HashSet<ListNode>();
        while(head!=null)
        {
            if(make.contains(head))//此处是contains，注意有s。
            {
                return true;
            }else{
                make.add(head);
                head=head.next;
            }
        }
        return false;
    }
    public boolean hasCycle2(ListNode head) {
    	if(head==null||head.next==null)
    	{
    		return false;
    	}
    	ListNode fast=head.next;
    	ListNode slow=head;
    	while(fast!=slow)
    	{
    		if(fast==null||fast.next==null)
    		{
    			return false;
    		}
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return true;
    }
    
}
