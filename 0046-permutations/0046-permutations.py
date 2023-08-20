def per(nums,p,ans):
    if len(nums)==0:
        ans.append(p)
        print(ans)
    else:
        for i in range(len(nums)):
            rest=nums[:i]+nums[i+1:]
            
            p.append(nums[i])
            # print(rest,p,ans)
            per(rest,p.copy(),ans)
            p.pop(len(p)-1)
class Solution:
    
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        p=[]
        per(nums,p,ans)
        return ans
        
        