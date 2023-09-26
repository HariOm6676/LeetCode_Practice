/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // TreeNode ans=null;
    public TreeNode traverse(final TreeNode original, final TreeNode cloned, final TreeNode target)
    {
        if (original==null || cloned==null)
        return null;
        if (original==target)
        {
            return cloned;
        }
        TreeNode left = traverse(original.left,cloned.left,target);
        TreeNode right = traverse(original.right,cloned.right,target);
        if (left!=null)
        return left;
        if (right!=null)
        return right;
   return null;
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return traverse(original,cloned,target);
    
    }
}