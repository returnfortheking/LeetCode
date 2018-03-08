/*
 * @author:ReturnOfTheKing
 * 
 * 21. Merge Two Sorted Lists
 * 
 * 1.双指针实现，主要注意分段式的边界点选取以及取到边界时的特殊情况讨论。
 * 
 * 2.递归实现，相当简便快捷。
 */
package LeetCode;

public class LeetCode_21 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode mergeTwoListsSelf(ListNode l1, ListNode l2) {
        if(l1==null)
        {
            return l2;
        }else if(l2==null)
        {
            return l1;
        }
        ListNode p=l1;
        ListNode q=l2;
        while(p!=null&&q!=null)
/*共以下几种情况
    1.p>q,p>q.next
        此时直接令q=q.next,重新循环
    2.p>q,p<=q.next
        此时令q链接p，q向后移1位
    3.q>=p,q>=p.next
        同上，令p=p.next,重复循环
    4.q>=p,q<p.next
        此时令p链接q，p向后移1位
*/
        {
            if(p.val<=q.val)
            {
                if(p.next==null)
                {
                    p.next=q;
                    break;
                }
                if(p.next.val>q.val)//此处没等号
                {
                	ListNode tmp=p.next;
                    p.next=q;
                    p=tmp;
                }else{
                	p=p.next;
                }

            }else{
                if(q.next==null)
                {
                    q.next=p;
                    break;
                }
            	if(q.next.val>=p.val)//此处有等号
            	{
                    ListNode tmp=q.next;
                    q.next=p;
                    q=tmp;            		
            	}else{
            		q=q.next;
            	}
            }
        }
        return l1.val<=l2.val?l1:l2;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {//递归实现，不用考虑特殊情况，因为已经在最开始排除掉了
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}
