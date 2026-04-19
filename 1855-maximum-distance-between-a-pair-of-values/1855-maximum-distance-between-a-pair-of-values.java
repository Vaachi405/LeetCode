class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int distance = 0;
        while(i<nums1.length && j<nums2.length){
            if(i<=j && nums1[i]<=nums2[j]){
                distance = Math.max(distance, j-i);
                j++;
            }
            else if(i<=j) i++;
            else j++;
        }
        return distance;
    }
}