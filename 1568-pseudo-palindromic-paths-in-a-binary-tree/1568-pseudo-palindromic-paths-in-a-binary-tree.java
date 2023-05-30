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
    int ans=0;
    void dfs(TreeNode root,List<Integer> m)
    {
        if(root!=null)
        {
             if(root.left==null && root.right==null)
            {
                int k=0;
                 m.set(root.val-1,m.get(root.val-1)+1);
                 for(int i=0;i<m.size();i++)
                 {
                     if(m.get(i)%2!=0)
                     k++;
                 }
            
                if(k<=1)
                ans++;
                
            }
            m.set(root.val-1,m.get(root.val-1)+1);
            
            dfs(root.left,new ArrayList<Integer> (m));
            dfs(root.right,new ArrayList<Integer>(m));
          
        }
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        List<Integer> m = new ArrayList<Integer>();
        for (int i=0;i<9;i++)
        {
            m.add(0);
        }
        dfs(root,m);
        return ans;
    }
}