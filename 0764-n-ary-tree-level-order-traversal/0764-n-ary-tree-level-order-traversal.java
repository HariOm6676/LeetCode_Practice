/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans= new ArrayList<>();
        if (root==null)
        return ans;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> curr= new ArrayList<>();
        curr.add(root.val);
        
        
        ans.add(new ArrayList<>(curr));
        curr.clear();
        while(!q.isEmpty())
        {
                Node t=q.poll();
                if(t==null)
                {
                
                if (q.isEmpty())
                break;
                ans.add(new ArrayList<>(curr));
                curr.clear();
                q.add(null);
                }
                else
                {
                for (Node t1:t.children)
                {
                    q.add(t1);
                    curr.add(t1.val);
                }
                }
                
                
        }
        return ans;
    }
}