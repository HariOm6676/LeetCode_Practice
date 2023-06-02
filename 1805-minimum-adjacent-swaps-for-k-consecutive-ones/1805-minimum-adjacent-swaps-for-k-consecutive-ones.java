class Solution {
    public int minMoves(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
     List<Integer> a= new ArrayList<Integer>();
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]==1)
         a.add(i);
     }   
     int s1=0;
     int ps[]= new int[a.size()];
     for(int i=0;i<a.size();i++)
     {
         s1+=a.get(i);
         ps[i]=s1;
     }
     int s=0,m=0,ls=0,rs=0;
     
     int i=0, j=k-1;
      int r=0;
     while(j<a.size())
     {
         int middle=(i+j)/2;
         r=middle-i;
            
        if(k%2==0)
        {
            m=(ps[j]-ps[middle])-(((middle==0)?0:ps[middle-1])-((i==0)?0:ps[i-1]))-a.get(middle)-r*(r+1)-(r+1);
        }
        else
        {
            m=(ps[j]-ps[middle])-(((middle==0)?0:ps[middle-1])-((i==0)?0:ps[i-1]));
            m-=r*(r+1);
        }
        // System.out.println(rs+" "+ls+" "+a.get(middle)+"  "+m);
        j++;
        i++;
        ans=Math.min(ans,m);
     }
     return ans;
    }
}