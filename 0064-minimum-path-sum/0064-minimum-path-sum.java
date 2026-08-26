class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // int[][] dp = new int[m][n];
        // dp[0][0] = grid[0][0];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0) continue;
                if(i==0){
                    grid[0][j] = grid[0][j-1] + grid[0][j];
                }
                else if(j==0){
                    grid[i][0] = grid[i-1][0] + grid[i][0];
                }
                else{
                    grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}