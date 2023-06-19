class Solution {
    List<Integer> dp= new ArrayList<>();
    boolean jump(int[] nums,int pos)
    {
        int n=nums.length;
        if(pos== n-1)
        return true;
        else
        dp.set(pos,1);
        // System.out.println(dp);
        int far= Math.min(n-1,pos+nums[pos]);
        for(int i=pos+1;i<=far;i++)
        {
            if(dp.get(i)==1)
            continue;
            if(jump(nums,i)==true)
            return true;
        }
        return false;

    }
    public boolean canJump(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            dp.add(-1);
        }
        return jump(nums,0);
    }
}