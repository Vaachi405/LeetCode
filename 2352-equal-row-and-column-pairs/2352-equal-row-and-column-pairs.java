class Solution {
    public int equalPairs(int[][] grid) {
        
        int len = grid.length;
        int[][] tGrid = new int[len][len];

        for(int i = 0; i < len; i++) {
            
            for(int j = 0; j < len; j++) {
                tGrid[i][j] = grid[j][i];
            }
        }

        int ans = 0;
        for(int[] arr : grid) {
            for(int[] arr1 : tGrid) {
                if(Arrays.equals(arr, arr1)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}