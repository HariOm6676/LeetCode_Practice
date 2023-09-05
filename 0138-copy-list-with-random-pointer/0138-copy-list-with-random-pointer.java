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
        if(head==null)
        return null;
        Node n=new Node(head.val);
        // if(head.next==null)
        // return n;
        Node temp1=head;
        Node temp=n;
        Node temp2=n;
        int k=0;
        HashMap<Node,Integer> map = new HashMap<>();
        while(temp1!=null)
        {
            map.put(temp1,k++);
            temp1=temp1.next;
        }
        temp1=head;
        System.out.println(map);
        head=head.next;
        // n.random=head.random;
        while(head!=null)
        {
            Node n1= new Node(head.val);
            n.next=n1;
            n=n1;
            head=head.next;
        }
        k=0;
        HashMap<Integer,Node> map1 = new HashMap<>();
        while(temp!=null)
        {
            map1.put(k++,temp);
            temp=temp.next;
        }
        System.out.println(map1);
        temp=temp2;
        while(temp1!=null)
        {
            temp2.random=(map1.get(map.get(temp1.random)));
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp;
    }

}