import java.util.*;

public class LakeFinder {
    public static int countLakes(int[][] grid) {
        // step 1: global check - is it null or empty? (DO I EVEN HAVE A GRID TO EXPLORE?)
        if (grid == null || grid.length == 0) return 0; 

        // step 2: make rows & cols* (how big is the grid?) + visited tracker + count
        // *helps us loop thru EVERY cell later!
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int lakesCount = 0; 

        // step 4: make nested for-loop (to check every cell in the grid for NEW lakes)
        for (int r = 0; r < rows; r++) // loop thru EACH ROW
        {
            for (int c = 0; c < cols; c++)  // loop thru EACH COLUMN
            {
                // step 5: if cell is part of NEW LAKE && its NOT visited
                if (grid[r][c] == 1 && !visited[r][c])
                {
                    lakesCount++;
                    dfs(grid, r, c, visited);
                }
            }
        }

        return lakesCount;
    }

    private static void dfs(int[][] grid, int r, int c, boolean[][] visited) {
        // step 6: base cases: if OUT OF BOUNDS (4 dir.) & if not part of lake (if land) OR visited
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;
        if (grid[r][c] == 0 || visited[r][c]) return;

        // step 7: mark as visited + explore all 4 directions
        visited[r][c] = true;

        // explore all 4 directions
        dfs(grid, r - 1, c, visited);
        dfs(grid, r + 1, c, visited);
        dfs(grid, r, c - 1, visited);
        dfs(grid, r, c + 1, visited);
    }
}
