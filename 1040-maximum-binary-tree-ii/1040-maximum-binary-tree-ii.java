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
    List<Integer> l= new ArrayList<Integer>();
    void inorder(TreeNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            l.add(root.val);
            inorder(root.right);
        }
    }

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        inorder(root);
        l.add(val);
        int[] nums = new int[l.size()];
        for(int i=0;i<l.size();i++)
        nums[i]=l.get(i);
        return create(nums,0,nums.length-1);
        
    }
    int max(int[] nums, int a, int b)
    {
        int index=a;
        int m=nums[a];
        for(int i=a+1;i<=b;i++)
        {
            if(nums[i]>m)
            {
                m=nums[i];
                index=i;
            }
        }
        return index;
    }
    public TreeNode create(int n[],int a , int b)
    {
       
    
        if(a<=b){   
            int index=max(n,a,b);
             TreeNode n1= new TreeNode(n[index]);
            //   System.out.println(a+"  "+b+"  "+index+"  "+max(n,a,b));
            // if(index>a)
        n1.left=create(n,a,index-1);
        // if(index<b)
        n1.right=create(n,index+1,b);
        return n1;
        }
        return null;

    }
   

}