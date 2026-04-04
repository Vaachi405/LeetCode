import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowCounts = new HashMap<>();

        // Store frequency of each row by converting it to a string
        for (int i = 0; i < n; i++) {
            String rowString = Arrays.toString(grid[i]);
            rowCounts.put(rowString, rowCounts.getOrDefault(rowString, 0) + 1);
        }

        int equalPairsCount = 0;
        // Check each column
        for (int j = 0; j < n; j++) {
            int[] colArray = new int[n];
            for (int i = 0; i < n; i++) {
                colArray[i] = grid[i][j];
            }
            String colString = Arrays.toString(colArray);
            if (rowCounts.containsKey(colString)) {
                equalPairsCount += rowCounts.get(colString);
            }
        }
        return equalPairsCount;
    }
}