class Solution {
    public int rob(int[] nums) {
        int prev1=0; //store the profit till previous house
        int prev2=0; //store the profit till previous to previous house
        for(int num:nums){
            int curr= Math.max(prev1, prev2+num); // select the max profit
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}