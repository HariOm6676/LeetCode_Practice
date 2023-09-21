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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode nn=null;
        ListNode fol=head;
        // ListNode n=null;
        while( curr != null)
        {
           fol=curr.next;
          curr.next=nn;
          nn=curr;
          curr=fol;
        }
        return nn;
    }
}