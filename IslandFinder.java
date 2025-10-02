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
        if (grid == null || grid.length == 0) return 0;

        // step 2: store the grid dimensions - needed when we loop later.
        int rows = grid.length;
        int cols = grid[0].length;

        // step 3: make visited tracker - don't want to count same island more than 1x.
        boolean[][] visited = new boolean[rows][cols];

        return 0;
    }
}
