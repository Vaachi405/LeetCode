class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq = new int[nums.length];
        int mis = 0;
        int dup = 0;

        for (int num : nums) {
            freq[num - 1]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (freq[i] == 0)
                mis = i + 1;
            else if (freq[i] > 1)
                dup = i + 1;
        }

        return new int[]{dup,mis};
    }
}