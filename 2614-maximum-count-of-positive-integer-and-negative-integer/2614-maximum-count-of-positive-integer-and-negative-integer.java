class Solution {
    public int maximumCount(int[] nums) {
        int i=0,j=nums.length-1,m=0,n=j+1;
        while(i<j)
        {
            m=(i+j)/2;
            if(nums[m]>0)
            j=m;
            else if(nums[m]<=0)
            i=m+1;
        }
        // System.out.println(i);
        int p=i;
        j=i;
    i=0;
    
    m=0;
        while(i<j)
        {
            m=(i+j)/2;
            if(nums[m]>=0)
            j=m;
            else if(nums[m]<0)
            i=m+1;
            
            // if(i==j)
            // break;
        }
        if(i==n-1 && nums[i]<0)
        return n;
   if(p==n-1 && i==0 && nums[i]==0)
  return 0;        
    //    if(nums[i]==0)
    //    return 0;
        return Math.max(n-p,i);
    }
}