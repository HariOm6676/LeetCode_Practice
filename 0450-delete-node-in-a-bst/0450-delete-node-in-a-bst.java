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
    int n=0;
    int is(TreeNode root)
    {
        while(root!=null)
        {
            n=root.val;
            root=root.left;
        }
        return n;
    }
    TreeNode delete(TreeNode root,int v)
    {
        if(root==null)
        return null;
        if(root.val>v)
        root.left=delete(root.left,v);
        else if(root.val<v)
        root.right=delete(root.right,v);
        else{
            if(root.left==null)
            return root.right;
            if(root.right==null)
            return root.left;

            int t=is(root.right);
            root.val=t;
            root.right=delete(root.right,t);
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        root=delete(root,key);
        return root;
    }
}