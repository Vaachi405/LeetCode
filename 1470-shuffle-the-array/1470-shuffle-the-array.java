class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[n+n];

        for(int i=0; i<(n+n); i++){
            if(i%2==0){
                ans[i] = nums[i/2];
            }else{
                ans[i] = nums[n+(i/2)];
            }
        }

        return ans;
    }
}