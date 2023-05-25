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
        int h;
    List<List<TreeNode>> t1=new  ArrayList<List<TreeNode>>();
   int dfs1(TreeNode root)
    {
      if(root!=null)
      {
        return Math.max(dfs1(root.left),dfs1(root.right))+1;
      }
      return 0;
    }
    void dfs(TreeNode root,List<TreeNode> t)
    {
      if(root!=null)
      {
        t.add(root);
        if(t.size()==h)
        t1.add(new ArrayList(t));
        dfs(root.left, new ArrayList(t));
        dfs(root.right,new ArrayList(t));
      }
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
              List<TreeNode> t= new ArrayList<TreeNode>();
      h=dfs1(root);
      dfs(root,t);
      System.out.println(t1);
      int i,c=0;
      for( i=0;i<t1.get(0).size();i++)
      {
        TreeNode k=t1.get(0).get(i);
        for(int j=1;j<t1.size();j++)
        {
          if(t1.get(j).get(i)!=k)
          {
            c=1;
            break;
          }
        }
        if(c==1)
        break;

      }

      return t1.get(0).get(i-1);  
    }
    }
