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
 class info{
        int sum;
        int max;
        int min;
        info(int x, int y, int z)
        {
            sum=x;
            max=y;
            min=z;
        }
    }
class Solution {
    
    int ans=0;
    info dfs(TreeNode root)
    {
            if(root==null)
            return new info(0,Integer.MIN_VALUE,Integer.MAX_VALUE);
            info left=dfs(root.left);
            info right= dfs(root.right);
            if(root.val>left.max && root.val<right.min)
                {
                    int s=left.sum+right.sum+root.val;
                    ans=Math.max(s,ans);
                    return new info(s,Math.max(root.val,right.max),Math.min(root.val,left.min));
                    
                }
            else
            return new info(Math.max(left.sum,right.sum),Integer.MAX_VALUE,Integer.MIN_VALUE);

    }

    public int maxSumBST(TreeNode root) {
        dfs(root);
       return ans;
}
}