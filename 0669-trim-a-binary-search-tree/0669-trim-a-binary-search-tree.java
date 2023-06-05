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
    TreeNode delete(TreeNode root)
    {
        if(root==null)
        return null;
    
            {
            if(root.left==null)
            return root.right;
            if(root.right==null)
            return root.left;

            int t=is(root.right);
            root.val=t;
            root.right=delete(root.right);
        }
        return root;
    }
    List<TreeNode> a=new ArrayList<TreeNode>();
    TreeNode dfs(TreeNode root,int low,int high)
    {
        if(root!=null){
       
        root.left=dfs(root.left,low,high);
        root.right=dfs(root.right,low,high);
         if(root.val>high || root.val<low)
        root=delete(root);
        return root;
        }
        return null;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
      return  dfs(root,low,high);
    }
}