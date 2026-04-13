class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int sum = 0;
        for (int i = 0; i < 101; i++) {
            int temp = count[i];
            count[i] = sum;
            sum += temp;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = count[nums[i]];
        }

        return ans;
    }
}