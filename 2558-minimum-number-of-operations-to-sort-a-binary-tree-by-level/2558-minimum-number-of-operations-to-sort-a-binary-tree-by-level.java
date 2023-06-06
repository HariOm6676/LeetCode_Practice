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
    void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            if(min_idx!=i)
            {
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            c++;
            }
        }
        // System.out.println(c);
    }
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> ans= new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode t= q.poll();
            if(t==null)
            {
                int a[]= new int[ans.size()];
                for(int i=0;i<ans.size();i++)
                a[i]=ans.get(i);
                sort(a);
                if(q.isEmpty())
                break;
                // System.out.println(ans);
                
                ans.clear();
                q.add(null);
            }
            else{
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
                ans.add(t.val);
            }
        }
        return c;
    }
}