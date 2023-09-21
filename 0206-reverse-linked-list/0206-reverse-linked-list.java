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
        ListNode n=null;
        while( curr != null)
        {
           n= new ListNode(curr.val);
          n.next=nn;
          nn=n;
          curr=curr.next;
        }
        return n;
    }
}