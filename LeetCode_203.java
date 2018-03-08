/*
 * @author:ReturnOfTheKing
 * 
 * 203. Remove Linked List Elements
 * 
 * 1.难点主要在于末尾的处理，可在头节点之前设立一个虚节点，这样就不会错过尾节点的判断。
 */
package LeetCode;

public class LeetCode_203 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;//在头节点之前设立一个虚节点。
        ListNode cur = dummy;

        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return dummy.next;
    }
}
