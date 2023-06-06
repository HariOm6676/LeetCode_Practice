/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
     void dfs(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root!=null)
        {
            if(scan(root,p)&&scan(root,q))
            ans=root;
            dfs(root.left,p,q);
            dfs(root.right,p,q);
        }
    }
      boolean scan(TreeNode root,TreeNode p)
    {
        if(root!=null)
        {
            if(root==p)
            return true;
            return (scan(root.left,p)|| scan(root.right,p));
        }
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return ans;
    }
}