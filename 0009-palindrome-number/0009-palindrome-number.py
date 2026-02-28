class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        num = str(x)
        rev = num[::-1]

        if num == rev:
            return True

        else:
            return False
            