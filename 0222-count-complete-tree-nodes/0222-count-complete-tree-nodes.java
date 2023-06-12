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
    int c=0;
    void count(TreeNode root)
    {
        if(root!=null)
        {
            c+=1;
            count(root.left);
            count(root.right);
        }
    } 
    public int countNodes(TreeNode root) {
        count(root);
        return c;
    }
}