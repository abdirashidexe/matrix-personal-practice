import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ForestFinderTest {

    @Test
    void testSingleForest() {
        int[][] grid = {
            {1, 1, 0},
            {1, 0, 0},
            {0, 0, 0}
        };
        assertEquals(1, ForestFinder.countForests(grid));
    }

    @Test
    void testTwoForests() {
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 0, 1, 1},
            {0, 0, 0, 0}
        };
        assertEquals(2, ForestFinder.countForests(grid));
    }

    @Test
    void testNoForests() {
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, ForestFinder.countForests(grid));
    }

    @Test
    void testDiagonalNotConnected() {
        int[][] grid = {
            {1, 0},
            {0, 1}
        };
        assertEquals(2, ForestFinder.countForests(grid));
    }

    @Test
    void testWholeGridIsForest() {
        int[][] grid = {
            {1, 1},
            {1, 1}
        };
        assertEquals(1, ForestFinder.countForests(grid));
    }

    @Test
    void testEmptyGrid() {
        int[][] grid = {};
        assertEquals(0, ForestFinder.countForests(grid));
    }

    @Test
    void testNullGrid() {
        int[][] grid = null;
        assertEquals(0, ForestFinder.countForests(grid));
    }
}
