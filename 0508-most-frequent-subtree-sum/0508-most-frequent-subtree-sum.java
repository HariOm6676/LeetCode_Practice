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
    HashMap<Integer,Integer> m= new HashMap<>();
    int  dfs(TreeNode root)
    {
        if(root!=null)
        {
            int ls=dfs(root.left);
            int rs=dfs(root.right);
            int s=ls+rs+root.val;
            m.put(s,(m.get(s)==null)?1:m.get(s)+1);
            return s;
        }
        return 0;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> a= new ArrayList<Integer>();
        dfs(root);
        System.out.println(m);
        int m1=Integer.MIN_VALUE;
        for(int i:m.keySet())
        {
            if(m.get(i)>m1)
            {
                m1=m.get(i);
                a.clear();
            }
            if(m.get(i)==m1)
            a.add(i);
        }
        int a1[]= new int[a.size()];
        for(int i=0;i<a.size();i++)
        a1[i]=a.get(i);
       return a1;
    }
}