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
    public TreeNode replaceValueInTree(TreeNode root) {
        TreeNode dummy=new TreeNode(0);
        List<TreeNode> ans= new ArrayList<TreeNode>();
        int s=0;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        HashMap<TreeNode,Integer> k= new HashMap<TreeNode,Integer>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode t= q.poll();
                if(t==null)
                {
                    

                    // System.out.println(ans);
                    for(int i=0;i<ans.size();i++)
                    {
                        if(i%2==0)
                        {
                            k.put(ans.get(i),(s-ans.get(i+1).val-ans.get(i).val));
                            // System.out.print(ans.get(i).val + "  "+i+"  "+s);//+ "  "+ ans.get(i+1).val+"  "+s+"  "+(s-ans.get(i+1).val-ans.get(i).val));

                            // 
                            
                        }
                        else
                        k.put(ans.get(i),s-ans.get(i-1).val-ans.get(i).val);
                    }
                    System.out.println();
                    ans.clear();
                    s=0;
                    if(q.isEmpty())
                    break;
                    q.add(null);
                }
                else if(t.val!=0)
                {
                    if(t.left!=null)
                    {
                        q.add(t.left);
                        s+=t.left.val;
                        ans.add(t.left);
                    }
                    else if(t.left==null)
                    {
                        q.add(dummy);
                        ans.add(dummy);
                    }

                    if(t.right!=null)
                    {
                        q.add(t.right);
                        s+=t.right.val;
                        ans.add(t.right);
                    }
                    else if(t.right==null)
                    {
                        q.add(dummy);
                        ans.add(dummy);
                    }
                }
               
            
        }
        root.val=0;
        for(TreeNode n:k.keySet())
        {
            n.val=k.get(n);
        }
         System.out.println(k);
        return root;
    }
}