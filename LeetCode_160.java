/*
 * @author:ReturnOfTheKing
 * 
 * 160. Intersection of Two Linked Lists
 * 
 * 1.1.遍历L1，用HashSet记录每个节点，然后遍历L2，看有没有重复的节点。
 * 2.有个双指针的方法，节约了空间，但是感觉过于繁琐，故不予记录。
 */
package LeetCode;

import java.util.*;

public class LeetCode_160 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //1.遍历L1，记录每个节点，然后遍历L2，看有没有重复的节点。
        Set<ListNode> L1=new HashSet<ListNode>();
        while(headA!=null)
        {
            L1.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(L1.contains(headB))
            {
                return headB;
            }else{
                headB=headB.next;
            }
        }
        return null;
    }
}
