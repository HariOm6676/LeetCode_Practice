def per(nums,p,ans):
    if len(nums)==0:
        ans.append(p)
        # print(ans)
    else:
        for i in range(len(nums)):
            if i<len(nums)-1 and nums[i]==nums[i+1]:
                continue
            rest=nums[:i]+nums[i+1:]
            
            p.append(nums[i])
            # print(rest,p,ans)
            per(rest,p.copy(),ans)
            p.pop(len(p)-1)
class Solution:
    
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        p=[]
        nums.sort()
        per(nums,p,ans)
        return ans