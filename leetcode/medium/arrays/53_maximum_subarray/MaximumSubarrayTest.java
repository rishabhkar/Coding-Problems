import java.util.Arrays;

public class MaximumSubarrayTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        MaximumSubarray solver = new MaximumSubarray();
        runCase("classic example", solver, new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6);
        runCase("single positive", solver, new int[]{1}, 1);
        runCase("single negative", solver, new int[]{-1}, -1);
        runCase("all negative", solver, new int[]{-2, -1, -3}, -1);
        runCase("all positive", solver, new int[]{5, 4, -1, 7, 8}, 23);
        runCase("all zeroes", solver, new int[]{0, 0, 0}, 0);
        runCase("alternating small values", solver, new int[]{1, -1, 1, -1, 1}, 1);
        runCase("best subarray near the end", solver, new int[]{8, -19, 5, -4, 20}, 21);
        runCase("mixed example", solver, new int[]{-2, -3, 4, -1, -2, 1, 5, -3}, 7);
        runCase("drop after strong prefix", solver, new int[]{2, -1, 2, 3, 4, -5}, 10);
        runCase("two elements", solver, new int[]{-2, 1}, 1);
        runCase("strictly increasing positive", solver, new int[]{1, 2, 3}, 6);
        runCase("zero beats negatives", solver, new int[]{-1, 0, -2}, 0);
        runCase("short positive window", solver, new int[]{4, -1, 2, 1}, 6);
        runCase("large early gain survives dips", solver, new int[]{100, -90, 50, -10, 60}, 110);
        System.out.println("MaximumSubarrayTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, MaximumSubarray solver, int[] input, int expected) {
        int actual = solver.maxSubArray(Arrays.copyOf(input, input.length));
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
