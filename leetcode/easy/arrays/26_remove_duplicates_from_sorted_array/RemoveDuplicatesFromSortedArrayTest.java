import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();
        runCase("empty array", solver, new int[]{}, 0, new int[]{});
        runCase("single element", solver, new int[]{1}, 1, new int[]{1});
        runCase("two equal values", solver, new int[]{1, 1}, 1, new int[]{1});
        runCase("two distinct values", solver, new int[]{1, 2}, 2, new int[]{1, 2});
        runCase("basic example", solver, new int[]{1, 1, 2}, 2, new int[]{1, 2});
        runCase("long official style example", solver, new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4});
        runCase("negative numbers", solver, new int[]{-3, -3, -2, -1, -1}, 3, new int[]{-3, -2, -1});
        runCase("already unique", solver, new int[]{1, 2, 3, 4, 5}, 5, new int[]{1, 2, 3, 4, 5});
        runCase("all duplicates", solver, new int[]{2, 2, 2, 2}, 1, new int[]{2});
        runCase("multiple duplicate blocks", solver, new int[]{1, 1, 1, 2, 2, 3}, 3, new int[]{1, 2, 3});
        runCase("duplicates at the end", solver, new int[]{0, 1, 1, 1, 1}, 2, new int[]{0, 1});
        runCase("mixed negative and positive", solver, new int[]{-1, 0, 0, 0, 1, 1, 2}, 4, new int[]{-1, 0, 1, 2});
        runCase("paired duplicates", solver, new int[]{1, 1, 2, 2, 3, 3, 4, 4}, 4, new int[]{1, 2, 3, 4});
        runCase("late uniques", solver, new int[]{5, 5, 5, 6, 7, 7, 8}, 4, new int[]{5, 6, 7, 8});
        runCase("last value repeated", solver, new int[]{9, 10, 10, 10, 10}, 2, new int[]{9, 10});
        System.out.println("RemoveDuplicatesFromSortedArrayTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, RemoveDuplicatesFromSortedArray solver, int[] input, int expectedLength, int[] expectedPrefix) {
        int[] working = Arrays.copyOf(input, input.length);
        int actualLength = solver.removeDuplicates(working);
        assertEquals(name + " length", expectedLength, actualLength);
        assertPrefixEquals(name + " prefix", expectedPrefix, working, actualLength);
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
