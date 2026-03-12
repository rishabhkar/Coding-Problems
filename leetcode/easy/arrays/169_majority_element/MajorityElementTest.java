import java.util.Arrays;

public class MajorityElementTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        MajorityElement solver = new MajorityElement();
        runCase("basic majority", solver, new int[]{3, 2, 3}, 3);
        runCase("classic example", solver, new int[]{2, 2, 1, 1, 1, 2, 2}, 2);
        runCase("single value", solver, new int[]{1}, 1);
        runCase("two equal values", solver, new int[]{5, 5}, 5);
        runCase("negative majority", solver, new int[]{-1, -1, -1, 2, 3}, -1);
        runCase("zero majority", solver, new int[]{0, 0, 0, 1, 2}, 0);
        runCase("majority at the end", solver, new int[]{6, 5, 5}, 5);
        runCase("alternating but majority exists", solver, new int[]{1, 2, 1, 2, 1}, 1);
        runCase("front loaded majority", solver, new int[]{4, 4, 4, 2, 2}, 4);
        runCase("scattered majority", solver, new int[]{9, 1, 9, 2, 9, 3, 9}, 9);
        runCase("narrow majority", solver, new int[]{7, 7, 8, 8, 7}, 7);
        runCase("three of four", solver, new int[]{10, 9, 10, 10}, 10);
        runCase("short odd length", solver, new int[]{2, 1, 2}, 2);
        runCase("negative and positive mix", solver, new int[]{-2, -2, 1, 1, -2}, -2);
        runCase("large repeated value", solver, new int[]{100, 100, 100, 50, 50}, 100);
        System.out.println("MajorityElementTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, MajorityElement solver, int[] input, int expected) {
        int actual = solver.majorityElement(Arrays.copyOf(input, input.length));
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
