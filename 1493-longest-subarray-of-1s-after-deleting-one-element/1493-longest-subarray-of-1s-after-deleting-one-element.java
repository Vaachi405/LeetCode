class Solution {
    public int longestSubarray(int[] nums) {
        int n= nums.length;
        int curr=0;
        int prev=0;
        int ans=0;
        for(int num:nums){
            if(num==1) curr++;
            else{
                ans=Math.max(ans,curr+prev);
                prev=curr;
                curr=0;
            }
        }
        ans = Math.max(ans,curr+prev);
        return ans==n ? ans-1: ans;
    }
}