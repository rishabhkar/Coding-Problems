import java.util.Arrays;

public class BuildArrayFromPermutationTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        BuildArrayFromPermutation solver = new BuildArrayFromPermutation();
        runCase("single element permutation", solver, new int[]{0}, new int[]{0});
        runCase("official style example", solver, new int[]{0, 2, 1, 5, 3, 4}, new int[]{0, 1, 2, 4, 5, 3});
        runCase("rotation permutation", solver, new int[]{5, 0, 1, 2, 3, 4}, new int[]{4, 5, 0, 1, 2, 3});
        runCase("swap two values", solver, new int[]{1, 0}, new int[]{0, 1});
        runCase("three cycle forward", solver, new int[]{2, 0, 1}, new int[]{1, 2, 0});
        runCase("three cycle backward", solver, new int[]{1, 2, 0}, new int[]{2, 0, 1});
        runCase("reverse order", solver, new int[]{3, 2, 1, 0}, new int[]{0, 1, 2, 3});
        runCase("two disjoint swaps", solver, new int[]{1, 3, 0, 2}, new int[]{3, 2, 1, 0});
        runCase("mixed permutation", solver, new int[]{2, 3, 1, 0}, new int[]{1, 0, 3, 2});
        runCase("five element example", solver, new int[]{4, 2, 0, 1, 3}, new int[]{3, 0, 4, 2, 1});
        runCase("long reverse permutation", solver, new int[]{6, 5, 4, 3, 2, 1, 0}, new int[]{0, 1, 2, 3, 4, 5, 6});
        runCase("another five element cycle", solver, new int[]{1, 4, 0, 2, 3}, new int[]{4, 3, 1, 0, 2});
        runCase("mixed four element case", solver, new int[]{2, 1, 3, 0}, new int[]{3, 1, 0, 2});
        runCase("another five element case", solver, new int[]{4, 0, 2, 1, 3}, new int[]{3, 4, 2, 0, 1});
        runCase("shifted cycle", solver, new int[]{1, 2, 3, 4, 0}, new int[]{2, 3, 4, 0, 1});
        System.out.println("BuildArrayFromPermutationTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, BuildArrayFromPermutation solver, int[] input, int[] expected) {
        int[] actual = solver.buildArray(Arrays.copyOf(input, input.length));
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
