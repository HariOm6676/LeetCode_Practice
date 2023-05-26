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
class Solution {
    int dfs(TreeNode root)
    {
       if(root==null)
       return 0;
       return Math.max(dfs(root.left),dfs(root.right))+1;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null)
        return null;
        int left=dfs(root.left);
        int right=dfs(root.right);
        if(left==right)
        return root;
        if(left>right)
        return lcaDeepestLeaves(root.left);
        else
        return lcaDeepestLeaves(root.right);
}
}