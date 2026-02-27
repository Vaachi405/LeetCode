class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        median = 0
        nums1 += nums2
        length = len(nums1)
        nums1.sort()
        if length % 2 == 1:
            n = (length + 1)/2
            median = float(nums1[n-1])

        else:
            m = int(length/2)
            sum = nums1[m-1] + nums1[m]
            median = sum/2.000
        
        return median
        