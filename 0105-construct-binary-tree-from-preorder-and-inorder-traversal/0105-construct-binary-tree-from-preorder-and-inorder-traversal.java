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
    int c=0;
    Map<Integer,Integer> m= new HashMap<Integer,Integer>();
    TreeNode create(int[] preorder,int i,int j)
    {
        if(i>j)
        return null;
        
        int r=preorder[c++];
        TreeNode n= new TreeNode(r);
        n.left=create(preorder,i,m.get(r)-1);
        n.right=create(preorder,m.get(r)+1,j);
        return n;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
            m.put(inorder[i],i);
        return create(preorder,0,preorder.length-1);
    }
}