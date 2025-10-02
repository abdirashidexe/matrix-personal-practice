import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IslandFinderTest {

    @Test
    void testSingleIsland() {
        int[][] grid = {
            {1, 1, 0},
            {1, 0, 0},
            {0, 0, 0}
        };
        assertEquals(1, IslandFinder.countIslands(grid));
    }

    @Test
    void testTwoIslands() {
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 0, 1, 1},
            {0, 0, 0, 0}
        };
        assertEquals(2, IslandFinder.countIslands(grid));
    }

    @Test
    void testNoIslands() {
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, IslandFinder.countIslands(grid));
    }

    @Test
    void testDiagonalNotConnected() {
        int[][] grid = {
            {1, 0},
            {0, 1}
        };
        assertEquals(2, IslandFinder.countIslands(grid));
    }
}
