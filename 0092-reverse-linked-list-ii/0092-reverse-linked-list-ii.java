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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr=head,prev=null,next=null,left1=null,right1=null,k=null;
        int m=0;
        if(left==right)
        return head;
        while(curr!=null)
        {
            m++;
            next=curr.next;
            if(m==left)
            {
            left1=prev;
            // System.out.println(m);
            // System.out.println(left1.val);
            }
            if(m==right)
            {right1=curr;
            if(left1!=null)
            (left1.next).next=curr.next;
            else
            {head.next=curr.next;
            head=curr;
            }
            // else
            // return head;
            // else if (curr.next==null)
            // return curr;
            }
            
            if(m>left && m<=right)
            {
                curr.next=prev;  
            }
            
            prev=curr;
            curr=next;
            // if(m==right)
            // {right1=curr;
            // right1.next=next;
            // }
        } 
        // System.out.println(k.val);
//  System.out.println((k).val);

        // right1.next=.next;
        // (left1.next).next=k;
        if(left1!=null)
        left1.next=right1;
        // right1.next=k;
        // System.out.println((right1).val);

        // right1.next=k;

        // while(head!=right1)
        // {
        //     System.out.println(head.val);
        //     head=head.next;
        // }
        return head;
        
       
    }
}