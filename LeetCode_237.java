/*
 * @author:ReturnOfTheKing
 * 
 * 237. Delete Node in a Linked List
 * 
 * 1.主要注意链表这一数据结构在java中的实现，感觉就是一个递归
 */

package LeetCode;

public class LeetCode_237 {
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	
	
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
