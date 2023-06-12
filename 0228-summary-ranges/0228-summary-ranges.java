class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans= new ArrayList<>();
        String s="";
        // int k1=0;
        for(int i=0;i<nums.length;)
        {
            int k= nums[i];
            
          int  k1=nums[i];
          int m=k;
            
            while(k==k1)
            {
                k+=1;
                if(i<nums.length-1)
                k1=nums[++i];
                else
                i++;
            }
            if(m!=(k-1))
            s=m+"->"+(k-1);
            else
            s=""+m;
            ans.add(s);
            // System.out.println(s+" "+k+"  "+k1);
            // i-=1;
            s="";
        }
        return ans;
    }
}