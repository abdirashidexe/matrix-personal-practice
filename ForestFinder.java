import java.util.*;

public class ForestFinder {

    /**
     * Counts the number of separate forests (clusters of trees) in the grid.
     *
     * @param grid a 2D array of ints (0 = empty, 1 = tree)
     * @return number of distinct forests
     */
    public static int countForests(int[][] grid) {
        // step 1: does grid EVEN exist? (null / empty) -- AKA "global check"
        if (grid == null || grid.length == 0) return 0;

        // step 2: the "set up pack" -- set up our environment
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int forestCount = 0;

        // step 3: make the nested for loop USING the rows and cols (NOTICED IT HELPS A TON CONNECTING the PREVIOUS step w the next step)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // step 4: check if its a forest ("local check") -- (if current one is a TREE + we have NOT visited)
                if (grid[r][c] == 1 && !visited[r][c]) {
                    // step 5: add to count + use helper method
                    forestCount++;
                    dfs(grid, r, c, visited);
                }
            }
        }

        return forestCount;
    }

    private static void dfs(int[][] grid, int r, int c, boolean[][] visited) {
        // step 6: "local" base cases (4): 1. out of bounds 2&3. water/empty? 4. visited?
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;
        if (grid[r][c] == 0 || visited[r][c]) return;

        // step 7: mark as visited + check all 4 directions!!
        visited[r][c] = true;

        dfs(grid, r - 1, c, visited);
        dfs(grid, r + 1, c, visited);
        dfs(grid, r, c - 1, visited);
        dfs(grid, r, c + 1, visited);
    }
}
