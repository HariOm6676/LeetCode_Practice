class Solution:
    def maximum69Number (self, num: int) -> int:
        c=""
        k=0
        s=str(num)
        for i in s:
            if i=="6" and k==0:
                c+='9'
                k+=1
            else:
                c+=i
        # print(c)
        return int(c)
        