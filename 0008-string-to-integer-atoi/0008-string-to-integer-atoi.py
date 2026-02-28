class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        num = '0123456789'
        ans = ''

        for char in s:
            if len(ans) == 0 and char == ' ':
                continue
            elif char != ' ' and (char in num or char in '+-') and len(ans) == 0:
                ans += char
            elif char in num:
                ans += char

            else:
                break

        if ans == '' or ans in '+-':
            return 0

        else:
            if int(ans) < -2**31:
                return -2**31
            elif int(ans) > 2**31 - 1:
                return 2**31 - 1

            else:
                return int(ans)