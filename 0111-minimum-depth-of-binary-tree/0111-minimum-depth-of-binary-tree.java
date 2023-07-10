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
    public int result(TreeNode root)
    {
          if(root==null)
         return 10000;
         if(root.left==null && root.right==null)
         return 1;
        return Math.min(result(root.left),result(root.right))+1;
    }
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;
        else
        return result(root);
       
    }
}