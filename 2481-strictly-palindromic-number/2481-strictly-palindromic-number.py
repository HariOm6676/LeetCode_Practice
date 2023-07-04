import numpy as np

class Solution:
    def isPalindrome(self,string):
        return string == string[::-1]

    def isStrictlyPalindromic(self, n: int) -> bool:
        for i in range(2, n-1):
            if not self.isPalindrome(np.base_repr(n, base=i)):
                return False

        return True