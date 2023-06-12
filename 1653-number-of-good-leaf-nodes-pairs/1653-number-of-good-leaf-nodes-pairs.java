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
    HashMap<TreeNode , TreeNode> m= new HashMap<TreeNode,TreeNode>();
    HashMap<TreeNode ,Integer> m1 = new HashMap<TreeNode ,Integer>();
    List<TreeNode> a= new ArrayList<TreeNode>();
    int c=0;
    void dfs(TreeNode root,int h)
    {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
            a.add(root);
            if(root.left!=null)
            {
                m.put(root.left,root);
                m1.put(root.left,h);
                dfs(root.left,h+1);
            }
            if(root.right!=null)
            {
                m.put(root.right,root);
                m1.put(root.right,h);
                dfs(root.right,h+1);
            }
        }
    }
    boolean ans(TreeNode a1,TreeNode b,int dis)
    {
         {
        int d=0;
        int d1=m1.get(a1);
        int d2=m1.get(b);
        // System.out.println(d1+" "+d2+"Harru");
        if(d1<d2)
        {
            while(d1<d2)
            {
                b=m.get(b);
                d2--;
                d++;
            }
           
        }
       
        else
        {
            while(d2<d1)
            {
               a1=m.get(a1);
               d1--;
               d++;
            }
            //   System.out.println(a1.val);
        }
        while(a1!=b)
        {
            a1=m.get(a1);
            b=m.get(b);
            d+=2;
        }
        // System.out.println(d);
        if(d<=dis)
        return true;
        else return false;

        }
    }
    void ans1(int d)
    {
        while(!a.isEmpty())
        {
            int i=0,j=1;
            TreeNode a2=a.get(i);
            while(j<a.size())
            {
               
                
                TreeNode a3=a.get(j);
                //  System.out.println(a2.val+" "+a3.val);
                if(ans(a2,a3,d)==true)
                {
                    // a.remove(a2);
                    // a.remove(a3);
                    // System.out.println("Parshiv");
                   c+=1;
                //    break;
                }
                j+=1;
            }
            a.remove(a2);
        }

    }

    
    public int countPairs(TreeNode root, int distance) {
        m1.put(root,0);
        dfs(root,1);
        ans1(distance);
        return c;
    }
}