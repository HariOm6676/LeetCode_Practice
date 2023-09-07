class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        high=m*n-1
        low=0
        while(low<=high):
            mid=low+(high-low)//2
            # print(low,high,mid,matrix[mid//n][mid%n])
            if matrix[mid//n][mid%n]==target:
                return True
            elif matrix[mid//n][mid%n]>target:
                high=mid-1
            else:
                low=mid+1
        return False

        