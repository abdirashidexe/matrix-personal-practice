import java.util.*;

public class IslandFinder {
    /**
     * Counts the number of islands in a grid.
     *
     * @param grid a 2D array of ints (0 = water, 1 = land)
     * @return number of distinct islands
     */
    public static int countIslands(int[][] grid) {

        // step 1: base case (if grid is NULL or EMPTY) - if grid is null or has no rows, there can't be any islands, so just return 0 immediately.
        // think "GLOBAL CHECK": start the PROCESS?
        if (grid == null || grid.length == 0) return 0;

        // step 2: store the grid dimensions - needed when we loop later.
        int rows = grid.length;
        int cols = grid[0].length;

        // step 3: make visited tracker w/ same shape as grid (rows x cols) - don't want to count same island more than 1x
        // boolean "grid" that says if we've visited (everything is FALSE by default)
        // + make count variable
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;

        // step 4: loop through WHOLE grid (so we look at each cell)
        for (int r = 0; r < rows; r++)  // -- walks thru each ROW
        {
            for (int c = 0; c < cols; c++) // -- walks through each COLUMN in that row
            {
                // step 5: check if start of a new island (so conditions are: is it 1 AND not in visited?)
                if (grid[r][c] == 1 && !visited[r][c])
                {
                    // step 6: add to count then explore & mark WHOLE island
                    count++;
                    dfs(grid, r, c, visited);
                }
            }
        }
        return 0;
    }

    // step 7: create dfs helper method -- grid (island map), r/c (current cell we're visiting), visited (mark cells we counted)
    // goal of this method: spread from STARTING land cell & mark ALL connected land cells as visited
    private static void dfs(int[][] grid, int r, int c, boolean[][] visited)
    {
        // step 8: base cases: if out of bounds (4 required checks) & if water OR visited
        // think "LOCAL CHECK": continue exploring from THIS cell?


    }
}
