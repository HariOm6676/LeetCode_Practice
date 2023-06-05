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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        int s=0;
        int ans=1;
        s=root.val;
        int m=s;
        s=0;
        int c=1;
        while(!q.isEmpty())
        {
            TreeNode t= q.poll();
            if(t==null)
            {
                if(q.isEmpty())
                break;

                c+=1;
                if(s>m)
                {
                    m=s;
                    ans=c;
                }
                q.add(null);s=0;
            }
            else{
                if(t.left!=null)
                {
                    s+=t.left.val;
                q.add(t.left);
                }

                if(t.right!=null)
                {
                    s+=t.right.val;
                q.add(t.right);
                }
            }
        }
        return ans;
        }
}