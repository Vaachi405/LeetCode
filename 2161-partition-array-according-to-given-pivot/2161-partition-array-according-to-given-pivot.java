class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0, i = 0;
        int right = n - 1, j = n - 1;

        while (i < n) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }
            if (nums[j] > pivot) {
                ans[right--] = nums[j];
            }
            i++;
            j--;
        }
        while (left <= right) {
            ans[left++] = pivot;
        }
        return ans;
    }
}