import java.util.Arrays;

public class PlusOneTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        PlusOne solver = new PlusOne();
        runCase("simple increment", solver, new int[]{1, 2, 3}, new int[]{1, 2, 4});
        runCase("no carry near the end", solver, new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2});
        runCase("single nine", solver, new int[]{9}, new int[]{1, 0});
        runCase("single zero", solver, new int[]{0}, new int[]{1});
        runCase("all nines", solver, new int[]{9, 9, 9}, new int[]{1, 0, 0, 0});
        runCase("carry through two digits", solver, new int[]{1, 9, 9}, new int[]{2, 0, 0});
        runCase("carry at the tail only", solver, new int[]{2, 3, 9}, new int[]{2, 4, 0});
        runCase("leading digit increments after carries", solver, new int[]{8, 9, 9, 9}, new int[]{9, 0, 0, 0});
        runCase("internal zeroes preserved", solver, new int[]{1, 0, 0}, new int[]{1, 0, 1});
        runCase("single digit non nine", solver, new int[]{7}, new int[]{8});
        runCase("middle digit carry", solver, new int[]{9, 8, 9}, new int[]{9, 9, 0});
        runCase("long carry chain", solver, new int[]{2, 9, 9, 9, 9}, new int[]{3, 0, 0, 0, 0});
        runCase("two trailing nines", solver, new int[]{1, 2, 9, 9}, new int[]{1, 3, 0, 0});
        runCase("zero in the middle", solver, new int[]{9, 0, 9}, new int[]{9, 1, 0});
        runCase("last digit only changes", solver, new int[]{3, 4, 5, 6}, new int[]{3, 4, 5, 7});
        System.out.println("PlusOneTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, PlusOne solver, int[] input, int[] expected) {
        int[] actual = solver.plusOne(Arrays.copyOf(input, input.length));
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
