import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LakeFinderTest {

    @Test
    void testSingleLake() {
        int[][] grid = {
            {1, 1, 0},
            {1, 0, 0},
            {0, 0, 0}
        };
        assertEquals(1, LakeFinder.countLakes(grid));
    }

    @Test
    void testTwoLakes() {
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 0, 1, 1},
            {0, 0, 0, 0}
        };
        assertEquals(2, LakeFinder.countLakes(grid));
    }

    @Test
    void testNoLakes() {
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, LakeFinder.countLakes(grid));
    }

    @Test
    void testDiagonalNotConnected() {
        int[][] grid = {
            {1, 0},
            {0, 1}
        };
        assertEquals(2, LakeFinder.countLakes(grid));
    }

    @Test
    void testWholeGridIsLake() {
        int[][] grid = {
            {1, 1},
            {1, 1}
        };
        assertEquals(1, LakeFinder.countLakes(grid));
    }

    @Test
    void testEmptyGrid() {
        int[][] grid = {};
        assertEquals(0, LakeFinder.countLakes(grid));
    }

    @Test
    void testNullGrid() {
        int[][] grid = null;
        assertEquals(0, LakeFinder.countLakes(grid));
    }
}
