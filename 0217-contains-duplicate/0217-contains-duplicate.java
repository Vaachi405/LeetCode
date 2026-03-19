class Solution {
    public boolean containsDuplicate(int[] nums) {
        //approach 1 O(nlogn) O(n)
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }                
        // }
        // return false;

        //approach 2 O(n) O(n)
        // Set<Integer> numSet= new HashSet<>();
        // for(int n:nums){
        //     if(numSet.contains(n)){
        //         return true;
        //     }
        //     numSet.add(n);
        // }
        // return false;

        //approach 2 O(n) O(n)
        Set<Integer> numSet= new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }
        return numSet.size()<nums.length;
    }
}