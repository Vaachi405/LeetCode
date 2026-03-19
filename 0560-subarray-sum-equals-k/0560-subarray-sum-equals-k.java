class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
       for(int i= 0 ; i< nums.length ; ++i){
        int currentsum = nums[i];
        if(currentsum == k) count++;
        for(int j= i+1 ; j< nums.length ; ++j){
            currentsum = currentsum + nums[j];
            if(currentsum == k) count++;
        }
       }
       return count;
    }
}