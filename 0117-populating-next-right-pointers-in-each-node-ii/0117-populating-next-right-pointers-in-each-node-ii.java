/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q= new LinkedList<>();
        List<Node> curr= new ArrayList<>();
        if (root==null)
        return null;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node t= q.poll();
            if(t==null)
            {
                for (int i=0;i<curr.size()-1;i++)
                {
                curr.get(i).next=curr.get(i+1);}
                if (q.isEmpty())
                break;
                q.add(null);
                curr.clear();
                               

            }
            else
            {
                if(t.left!=null)
                {
                q.add(t.left);
                curr.add(t.left);
                }
                if(t.right!=null)
                {
                q.add(t.right);
                curr.add(t.right);
                }
            }
            
        }
        return root;
    }
}