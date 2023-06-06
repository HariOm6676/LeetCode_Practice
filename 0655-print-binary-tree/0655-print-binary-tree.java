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
    int h,m,n;
    void dfs1(String[][] ans,TreeNode root,int r,int c)
    {
        if(root!=null&&r<m&&c<n&&r>=0&&c>=0)
        {
        ans[r][c]=""+root.val;
        System.out.println(ans[r][c]);
        dfs1(ans,root.left,r+1,c-(int)Math.pow(2,h-r-1));
        dfs1(ans,root.right,r+1,c+(int)Math.pow(2,h-r-1));
        }
    }
    int dfs(TreeNode root)
    {
        if(root!=null)
        return Math.max(dfs(root.left),dfs(root.right))+1;
        return 0;
    }
    public List<List<String>> printTree(TreeNode root) {
         List<List<String>> ans= new ArrayList<>();
         h=dfs(root)-1;
        //  if(root.left==null && root.right==null)
        //  h-=1;
          m=h+1;
          n=(int)(Math.pow(2,h+1)-1);
         System.out.println(m+"  "+n);
       
        String[][] ans1= new String[m][n];

        dfs1(ans1,root,0,(n-1)/2);
          for(int i=0;i<m;i++)
        {
         List<String> temp= new ArrayList<>();
            for(int j=0;j<n;j++)
            if(ans1[i][j]!=null)
            {
            temp.add(ans1[i][j]);
            }
            else
            temp.add("");
          ans.add(temp);
         
        }
        return ans;
    }
}