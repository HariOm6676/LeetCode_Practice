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
    boolean ans=true;
    void dfs(TreeNode r1,TreeNode r2)
    {
        // System.out.println(r1.val+"  "+r2.val+"  "+ans);
        if(r1!=null && r2!=null && r1.val==r2.val)
        {
            if(r1.left==null && r1.right==null && r2.left==null && r2.right==null)
            {
                // ans=true;
            }
            else if(r1.left==null && r2.left==null)
            {
                    dfs(r1.right,r2.right);
            }
            else if(r1.right==null && r2.right==null)
            {
                    dfs(r1.left,r2.left);
            }
            else if(r1.left==null && r2.right==null)
            {
                    dfs(r1.right,r2.left);
            }
            else if(r1.right==null && r2.left==null)
            {
                    dfs(r1.left,r2.right);
            }
            else if(r1.left!=null&& r2.left!=null && r1.right!=null && r2.right!=null)
            {
                if(r1.left.val==r2.left.val)
                {
                dfs(r1.left,r2.left);
                dfs(r1.right,r2.right);
                }
                else
                {
                dfs(r1.left,r2.right);
                dfs(r1.right,r2.left);
                }
            }
            else
            {
                ans=false;
            }
        }
        else if(r1!=null || r2!=null)
        {
            ans=false;
        }
    }
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        dfs(root1,root2);
        return ans;
    }
}