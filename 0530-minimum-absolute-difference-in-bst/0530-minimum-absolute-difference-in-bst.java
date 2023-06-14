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
     int f=0,k=1,d=Integer.MAX_VALUE;
   void preorder(TreeNode root)
   {
       if(root!=null){
      
       preorder(root.left);
        if(k==1)
       f=root.val;
       else
       {
           d=Math.min(root.val-f,d);
           f=root.val;
       }
       System.out.println(f);
       k++;
       preorder(root.right);
       
       }
   }
    public int getMinimumDifference(TreeNode root) {
  preorder(root);
                return d;

    }
}