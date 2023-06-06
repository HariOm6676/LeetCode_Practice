/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class CBTInserter {
  Queue<TreeNode> q1=new LinkedList<>();
  TreeNode root;
    public CBTInserter(TreeNode root) {
        this.root=root;
        Queue<TreeNode> q= new LinkedList<>();
      
        q.add(root);
        while(!q.isEmpty())
        {
            root=q.poll();
            if(root.left==null || root.right==null)
            q1.add(root);
            if(root.left!=null)
            q.add(root.left);
            if(root.right!=null)
            q.add(root.right);
        }       
    }
    
    public int insert(int val) {
        TreeNode child= new TreeNode(val);
        q1.add(child);
        TreeNode parent=q1.element();
        if(parent.left==null)
        {
            parent.left=child;
        }
        else
        {
            parent.right=child;
            q1.poll();
        }
        return parent.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */