class Solution {
    public int numEnclaves(int[][] grid) {
    // m (rows)
    // n (cols)
    // 0 = sea cell
    // 1 = land cell

    // return: # of land cells where they're ENCLOSED (cannot walk off boundary)
    
    // step 1: grid exists? (null / empty)
    if (grid == null || grid.length == 0) return 0;

    // step 2: the "set up" pack
    int rows = grid.length;
    int cols = grid[0].length;
    boolean[][] visited = new boolean[rows][cols];
    int landCount = 0;

    // step 3: nested for-loop
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++)
        {
            // step 4: is it LAND and NOT visited?
            if (grid[r][c] == 1 && !visited[r][c])
            {
                // step 5: add to count + start dfs
                landCount++;
                dfs(grid, r, c, visited);
            }
        }
    }

    return landCount;
    }

    private static void dfs(int[][] grid, int r, int c, boolean[][] visited) {
        // step 6: "local" checks (4) -> 1. out of bounds? 2&3. water/empty? 4. already visited? | AKA early returns stage
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;
        if (grid[r][c] == 0 || visited[r][c]) return;

        // step 7: mark as visited & recurse all 4 directions
        visited[r][c] = true;

        dfs(grid, r - 1, c, visited);
        dfs(grid, r + 1, c, visited);
        dfs(grid, r, c - 1, visited);
        dfs(grid, r, c + 1, visited);
    }
}