import java.util.Arrays;

public class FindPivotIndexTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        FindPivotIndex solver = new FindPivotIndex();
        runCase("official style pivot", solver, new int[]{1, 7, 3, 6, 5, 6}, 3);
        runCase("no pivot", solver, new int[]{1, 2, 3}, -1);
        runCase("pivot at zero", solver, new int[]{2, 1, -1}, 0);
        runCase("single element", solver, new int[]{1}, 0);
        runCase("pivot at end", solver, new int[]{1, -1, 0}, 2);
        runCase("all zeroes choose leftmost", solver, new int[]{0, 0, 0, 0}, 0);
        runCase("negative values balance at start", solver, new int[]{-1, -1, -1, 0, 1, 1}, 0);
        runCase("middle pivot short array", solver, new int[]{1, 2, 1}, 1);
        runCase("pivot in larger mixed array", solver, new int[]{2, 3, -1, 8, 4}, 3);
        runCase("zero at front works", solver, new int[]{0, 1, -1}, 0);
        runCase("pivot near the end", solver, new int[]{1, 2, 3, 4, 6}, 3);
        runCase("classic alternate example", solver, new int[]{-7, 1, 5, 2, -4, 3, 0}, 3);
        runCase("alternating values with first pivot", solver, new int[]{1, -1, 1, -1, 1, -1, 1}, 0);
        runCase("repeated balance at front", solver, new int[]{10, -10, 10, -10, 10}, 0);
        runCase("short no pivot case", solver, new int[]{2, 5, 3}, -1);
        System.out.println("FindPivotIndexTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, FindPivotIndex solver, int[] input, int expected) {
        int actual = solver.pivotIndex(Arrays.copyOf(input, input.length));
        assertEquals(name, expected, actual);
        testsRun++;
    }

    private static void assertEquals(String name, int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(name + " expected=" + expected + " actual=" + actual);
        }
    }

    private static void assertEquals(String name, boolean expected, boolean actual) {
        if (expected != actual) {
            throw new AssertionError(name + " expected=" + expected + " actual=" + actual);
        }
    }

    private static void assertArrayEquals(String name, int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError(name + " expected=" + Arrays.toString(expected) + " actual=" + Arrays.toString(actual));
        }
    }

    private static void assertPrefixEquals(String name, int[] expectedPrefix, int[] actual, int length) {
        int[] actualPrefix = Arrays.copyOf(actual, length);
        if (!Arrays.equals(expectedPrefix, actualPrefix)) {
            throw new AssertionError(name + " expectedPrefix=" + Arrays.toString(expectedPrefix) + " actualPrefix=" + Arrays.toString(actualPrefix));
        }
    }

}
