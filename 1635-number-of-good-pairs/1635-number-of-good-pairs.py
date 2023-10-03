class Solution(object):
    def numIdenticalPairs(self, nums):
        d={}
        s=0
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        for i in d:
            s=s+d[i]*(d[i]-1)/2
        return s
        """
        :type nums: List[int]
        :rtype: int
        """
        