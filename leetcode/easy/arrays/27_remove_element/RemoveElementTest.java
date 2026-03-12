import java.util.Arrays;

public class RemoveElementTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();
        runCase("empty array", solver, new int[]{}, 1, 0, new int[]{});
        runCase("single removable value", solver, new int[]{3}, 3, 0, new int[]{});
        runCase("single kept value", solver, new int[]{3}, 2, 1, new int[]{3});
        runCase("official style example one", solver, new int[]{3, 2, 2, 3}, 3, 2, new int[]{2, 2});
        runCase("official style example two", solver, new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5, new int[]{0, 1, 3, 0, 4});
        runCase("all values removed", solver, new int[]{1, 1, 1, 1}, 1, 0, new int[]{});
        runCase("value never appears", solver, new int[]{1, 2, 3, 4}, 5, 4, new int[]{1, 2, 3, 4});
        runCase("remove first position only", solver, new int[]{2, 1}, 2, 1, new int[]{1});
        runCase("remove last position only", solver, new int[]{1, 2}, 2, 1, new int[]{1});
        runCase("negative values", solver, new int[]{-1, -1, 0, 1}, -1, 2, new int[]{0, 1});
        runCase("remove zeroes", solver, new int[]{0, 0, 1, 0, 2, 0}, 0, 2, new int[]{1, 2});
        runCase("alternating removable values", solver, new int[]{4, 5, 4, 5, 4}, 4, 2, new int[]{5, 5});
        runCase("clustered removals at the front", solver, new int[]{2, 2, 2, 3, 3}, 2, 2, new int[]{3, 3});
        runCase("multiple scattered removals", solver, new int[]{1, 2, 3, 2, 4, 2, 5}, 2, 4, new int[]{1, 3, 4, 5});
        runCase("keep trailing segment", solver, new int[]{7, 8, 9}, 7, 2, new int[]{8, 9});
        System.out.println("RemoveElementTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, RemoveElement solver, int[] input, int value, int expectedLength, int[] expectedPrefix) {
        int[] working = Arrays.copyOf(input, input.length);
        int actualLength = solver.removeElement(working, value);
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
