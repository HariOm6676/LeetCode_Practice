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
    List<Long> a= new ArrayList<>();
       long  dfs(TreeNode root)
    {
        if(root!=null)
        {
            long s=dfs(root.left)+dfs(root.right)+root.val;
            a.add(s);
            return s;
        }
        return 0;
    }
    public int maxProduct(TreeNode root) {
        long b= dfs(root);
        long m=Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++)
        {
            m=(Math.max(m,(b-a.get(i))*a.get(i)));
        }
        return (int)((m)%(Math.pow(10,9)+7));
        
    }
}