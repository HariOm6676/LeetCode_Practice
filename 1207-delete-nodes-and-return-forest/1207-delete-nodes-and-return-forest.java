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
    Map<TreeNode,TreeNode> s= new HashMap<TreeNode , TreeNode>();
    Set<Integer> s1= new HashSet<Integer>();
    List<TreeNode> ans= new ArrayList<TreeNode>();
    void map_define(TreeNode root)
    {
        if(root!=null)
        {
            if(root.left!=null)
            s.put(root.left,root);
            if(root.right!=null)
            s.put(root.right,root);
            map_define(root.left);
            map_define(root.right);
        }
    }
    TreeNode dfs(TreeNode root)
    {
        if(root!=null)
        {
            
           root.left= dfs(root.left);
            root.right=dfs(root.right);
            if(s1.contains(root.val))
            return null;
            else if(s.containsKey(root) && s1.contains(s.get(root).val))
            ans.add(root);
            // System.out.println(ans);
        return root;

                
     }
     return null;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        map_define(root);
        for(int a:to_delete)
        s1.add(a);
        
        // System.out.println(s);
       TreeNode k= dfs(root);
       if(k!=null && !s1.contains(k))
       ans.add(k);
      return  ans;
    }
}