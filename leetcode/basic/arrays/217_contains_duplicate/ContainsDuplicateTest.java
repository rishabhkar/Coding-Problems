import java.util.Arrays;

public class ContainsDuplicateTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();
        runCase("empty array", solver, new int[]{}, false);
        runCase("single value", solver, new int[]{1}, false);
        runCase("simple duplicate", solver, new int[]{1, 2, 3, 1}, true);
        runCase("all unique small array", solver, new int[]{1, 2, 3, 4}, false);
        runCase("multiple duplicates", solver, new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true);
        runCase("negative duplicate", solver, new int[]{-1, -2, -3, -1}, true);
        runCase("duplicate zeroes", solver, new int[]{0, 0}, true);
        runCase("strictly decreasing unique", solver, new int[]{5, 4, 3, 2, 1}, false);
        runCase("duplicate at the end", solver, new int[]{2, 14, 18, 22, 22}, true);
        runCase("large unique values", solver, new int[]{100000, 200000, 300000}, false);
        runCase("integer extremes unique", solver, new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, false);
        runCase("integer minimum repeated", solver, new int[]{Integer.MIN_VALUE, 0, Integer.MIN_VALUE}, true);
        runCase("long unique tail", solver, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, false);
        runCase("duplicate after long prefix", solver, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1}, true);
        runCase("two equal values", solver, new int[]{42, 42}, true);
        System.out.println("ContainsDuplicateTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, ContainsDuplicate solver, int[] input, boolean expected) {
        boolean actual = solver.containsDuplicate(Arrays.copyOf(input, input.length));
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
