package LeetCode;

public class LeetCode_2 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
    public ListNode addTwoNumbers_selfwrong(ListNode l1, ListNode l2) {
        ListNode h1=new ListNode(0);
        ListNode h2=new ListNode(0);
        ListNode one=new ListNode(1);
        h1.next=l1;
        h2.next=l2;
        int c=0;
        while((l1!=null)&&(l2!=null))
        {
            int temp=0;
            temp=l1.val+l2.val+c;
            c=0;
            if(temp>9)
            {
                c=1;
                temp=temp-10;
            }
            l1.val=temp;
            l2.val=temp;
            l1=l1.next;
            l2=l2.next;       
        }
        if((l1==null)&&(l2==null)&&(c>0))
        {
            l1=one;
        }
        if(l1!=null)
        {
            while(l1!=null)
            {
                int temp=l1.val+c;
                c=0;
                if(temp>9)
                {
                    temp=temp-10;
                    c=1;
                }
                l1.val=temp;
                l1=l1.next;
            }
            if(c>0)
            {
                l1=one;
            }
            return h1.next;
        }
        if(l2!=null)
        {
            while(l2!=null)
            {
                int temp=l2.val+c;
                c=0;
                if(temp>9)
                {
                    temp=temp-10;
                    c=1;
                }
                l2.val=temp;
                l2=l2.next;
            }
            if(c>0)
            {
                l2=one;
            }
            return h2.next;
        }
        return h1.next;

    }
}
