import java.util.Arrays;

public class RunningSumOf1DArrayTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        RunningSumOf1DArray solver = new RunningSumOf1DArray();
        runCase("basic increasing example", solver, new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10});
        runCase("all ones", solver, new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5});
        runCase("official style mixed values", solver, new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17});
        runCase("empty array", solver, new int[]{}, new int[]{});
        runCase("single zero", solver, new int[]{0}, new int[]{0});
        runCase("alternating negatives", solver, new int[]{-1, 1, -1, 1}, new int[]{-1, 0, -1, 0});
        runCase("mixed sign values", solver, new int[]{5, -2, 3}, new int[]{5, 3, 6});
        runCase("zeroes after large value", solver, new int[]{10, 0, 0}, new int[]{10, 10, 10});
        runCase("single positive", solver, new int[]{7}, new int[]{7});
        runCase("two equal values", solver, new int[]{2, 2}, new int[]{2, 4});
        runCase("large then decreasing", solver, new int[]{100, -50, -25}, new int[]{100, 50, 25});
        runCase("repeated nines", solver, new int[]{9, 9, 9}, new int[]{9, 18, 27});
        runCase("alternating zero and one", solver, new int[]{1, 0, 1, 0}, new int[]{1, 1, 2, 2});
        runCase("all negatives", solver, new int[]{-5, -5, -5}, new int[]{-5, -10, -15});
        runCase("mixed ending positive", solver, new int[]{8, 1, -3, 4}, new int[]{8, 9, 6, 10});
        System.out.println("RunningSumOf1DArrayTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, RunningSumOf1DArray solver, int[] input, int[] expected) {
        int[] actual = solver.runningSum(Arrays.copyOf(input, input.length));
        assertArrayEquals(name, expected, actual);
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
