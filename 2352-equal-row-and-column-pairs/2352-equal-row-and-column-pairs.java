class Solution {
    public int equalPairs(int[][] grid) {
        
        int len = grid.length;
        int[][] tGrid = new int[len][len];

        for(int i = 0; i < grid.length; i++) {
            boolean isEqual = true;
            for(int j = 0; j < grid.length; j++) {
                tGrid[i][j] = grid[j][i];
            }
        }

        int op = 0;
        for(int[] arr : grid) {
            for(int[] arr1 : tGrid) {
                if(Arrays.equals(arr, arr1)) {
                    op++;
                }
            }
        }

        return op;
    }
}