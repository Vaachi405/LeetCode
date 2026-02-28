class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        num = 0
        roman={'I':1,'V':5, 'X':10,'L':50,'C':100,'D':500,'M':1000}
        s = s.replace("IV", "IIII").replace("XC", "LXXXX").replace("XL", "XXXX").replace("IX", "VIIII").replace("CD", "CCCC").replace("CM", "DCCCC")
        for char in s:
            num += roman[char]
        return num