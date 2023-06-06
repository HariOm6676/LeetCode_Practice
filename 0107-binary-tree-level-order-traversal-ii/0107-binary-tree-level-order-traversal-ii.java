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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null)
        return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> a= new ArrayList<>();
        a.add(root.val);
        ans.add(new ArrayList<Integer>(a));
        a.clear();
        while(!q.isEmpty())
        {
            TreeNode t= q.poll();
            if(t==null)
            {
                
                if(q.isEmpty())
                break;
                ans.add(new ArrayList<Integer>(a));
                a.clear();
                q.add(null);
            }
            else
            {
                if(t.left!=null)
                {
                q.add(t.left);
                a.add(t.left.val);
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                    a.add(t.right.val);
                }
            }
        }
         Collections.reverse(ans);
         return ans;
    }
}