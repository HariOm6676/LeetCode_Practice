class Solution:
    def minimumSum(self, num: int) -> int:
        s=str(num)
        n=[]
        n[:]=s
        n.sort()
        return int(n[0]+n[3])+int(n[1]+n[2])