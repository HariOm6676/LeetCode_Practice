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
 import java.math.BigInteger;
class Solution {
     TreeNode ans=null;
    public int findBottomLeftValue(TreeNode root) {
       
        Queue <TreeNode> q= new LinkedList<TreeNode>();
        q.add(root);
        ans=(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode t= q.poll();
            if(t==null)
            {
                if(q.peek()!=null)
                ans=q.peek();
                if(q.isEmpty())
                break;
                q.add(null);
            }
            else{
            if(t.left!=null)
            q.add(t.left);
            if(t.right!=null)
            q.add(t.right);
            }
              System.out.println(ans.val);
        }
        // if(ans!=null)
     
        return ans.val;
    }
}