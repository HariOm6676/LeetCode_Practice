/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode MergeList(ListNode l1, ListNode l2)
    {
        if (l1==null)
        return l2;
        if (l2==null)
        return l1;
        ListNode dummy= new ListNode();
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode pre=dummy;
        while( c1!= null && c2!=null)
        {
            if (c1.val<=c2.val)
            {
                pre.next=c1;
                c1=c1.next;
            }
            else{
                pre.next=c2;
                c2=c2.next;
            }
            pre=pre.next;
        }
        if (c1==null)
        pre.next=c2;
        else
        pre.next=c1;
        return dummy.next;
    }
    public ListNode MergeList2(ListNode l1, ListNode l2)
    {
        if (l1==null)
        return l2;
        if (l2==null)
        return l1;
        
        ListNode res=null;
        if (l1.val<=l2.val)
        {
            res=l1;
            res.next=MergeList2(l1.next,l2);
        }
        else{
            res=l2;
            res.next=MergeList2(l1,l2.next);
        }
        return res;
    }
    ListNode GetMiddle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while ( fast.next!=null && fast.next.next!=null )
        {
        slow=slow.next;
        fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        return temp;
    }
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null)
        return head;
        ListNode hah=GetMiddle(head);
        // return hah;
        ListNode left=sortList(head);
        ListNode right=sortList(hah);
        return MergeList2(left,right);


    }
}