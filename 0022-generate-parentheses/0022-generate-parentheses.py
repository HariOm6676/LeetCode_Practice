def valid(s):
    l=[]
    for i in range(0,len(s)):
        if len(l)==0 and s[i]==')' :
            return False
        if s[i]==')' and l[0]=='(':
            l.pop()
        else:
            l.append(s[i])
    if len(l)==0:
        return True
    else:
        return False
def per(nums,p,ans):
    if len(nums)==0:
        ans.append("".join(p))
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
    def generateParenthesis(self, n: int) -> List[str]:
        ans=[]
        s="()"*n
        s1=list(s)
        s1.sort()
        per(s1,[],ans)
        ans1=[]
        for i in ans:
            if valid(i)==True:
                ans1.append(i)

        return ans1
        