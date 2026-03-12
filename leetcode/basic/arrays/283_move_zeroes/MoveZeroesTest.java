import java.util.Arrays;

public class MoveZeroesTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        MoveZeroes solver = new MoveZeroes();
        runCase("official style example", solver, new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0});
        runCase("single zero", solver, new int[]{0}, new int[]{0});
        runCase("single non zero", solver, new int[]{1}, new int[]{1});
        runCase("no zeroes", solver, new int[]{1, 2, 3}, new int[]{1, 2, 3});
        runCase("two leading zeroes", solver, new int[]{0, 0, 1}, new int[]{1, 0, 0});
        runCase("alternating zeroes", solver, new int[]{1, 0, 2, 0, 3, 0}, new int[]{1, 2, 3, 0, 0, 0});
        runCase("long mixed example", solver, new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0}, new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0});
        runCase("all zeroes", solver, new int[]{0, 0, 0}, new int[]{0, 0, 0});
        runCase("negative value plus zero", solver, new int[]{-1, 0, 1}, new int[]{-1, 1, 0});
        runCase("zero then one", solver, new int[]{0, 1}, new int[]{1, 0});
        runCase("one then zero", solver, new int[]{1, 0}, new int[]{1, 0});
        runCase("zeroes in the middle", solver, new int[]{2, 1, 0, 3, 0}, new int[]{2, 1, 3, 0, 0});
        runCase("many front zeroes", solver, new int[]{0, 2, 0, 0, 3, 4}, new int[]{2, 3, 4, 0, 0, 0});
        runCase("single trailing non zero", solver, new int[]{5, 0, 0, 0, 6}, new int[]{5, 6, 0, 0, 0});
        runCase("empty array", solver, new int[]{}, new int[]{});
        System.out.println("MoveZeroesTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, MoveZeroes solver, int[] input, int[] expected) {
        int[] working = Arrays.copyOf(input, input.length);
        solver.moveZeroes(working);
        assertArrayEquals(name, expected, working);
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
