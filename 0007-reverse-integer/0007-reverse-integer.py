class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        lower, upper = -2**31, 2**31 - 1
        rev = 0
        sign = 0
        if x < 0:
            sign = -1
        else:
            sign = 1
        x = abs(x)
        
        while x != 0:
            digit = x % 10
            rev = rev * 10 + digit
            x //= 10
            
        rev *= sign
        
        if rev < lower or rev > upper:
            return 0
        else:
            return rev        