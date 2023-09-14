/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head==null)
        return null;
        HashMap<Node, Node> map= new HashMap<Node,Node>();
        Node dummy= new Node(-1);
        Node ptr=head;
        Node pre=dummy;
        while(ptr!=null)
        {
            pre.next=new Node(ptr.val);
            map.put(ptr,pre.next);
            ptr=ptr.next;
            pre=pre.next;
        }
        ptr=head;
        pre=dummy.next;
        while(ptr!=null)
        {
            pre.random=map.get(ptr.random);
            pre=pre.next;
            ptr=ptr.next;
        }
        return dummy.next;
    }
}