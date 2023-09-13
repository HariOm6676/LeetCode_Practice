import math
def solve(r,c,k ):
    f=2*c+2*r-4
    # print(f)
    l=1
    while f!=0 and k>f:
        k-=f
        f-=8
        l+=1
    r1=r-2*(l-1)
    c1=c-2*(l-1)
    # if r1==1 and c1==1:
    #     return [l-1,l-1]
    # print(r,c)

    a=c1
    b=a+r1-1
    c2=b+c1-1
    d=c2+r1-2
    # print(r1,k)
    if k<=a:
        return [l-1,l-1+k-1]
    elif k<=b:
        k-=a
        return [l-1+k,c-l]
    elif k<=c2:
        k-=b
        return [r-l,c-l-k]
    else:
        k-=c2
        return [r-l-k,l-1]

        
class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        l= [ [0]*n for i in range(n)]
        for i in range(1,n*n+1):
            k=solve(n,n,i)
            l[k[0]][k[1]]=i
        return l
        