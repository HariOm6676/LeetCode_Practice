class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        k=len(matrix[0])-1
        i=0
        while(i<len(matrix)and  k>=0):
            # print(matrix[i][k])
            if matrix[i][k]==target:
                return True
            if matrix[i][k]>target:
                k-=1
            else:
                i+=1
            # print(i)
        return False