import java.util.Arrays;

public class MergeSortedArrayTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        MergeSortedArray solver = new MergeSortedArray();
        runCase("official style example", solver, new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6});
        runCase("second array empty", solver, new int[]{1}, 1, new int[]{}, 0, new int[]{1});
        runCase("first array empty", solver, new int[]{0}, 0, new int[]{1}, 1, new int[]{1});
        runCase("single insert before first", solver, new int[]{2, 0}, 1, new int[]{1}, 1, new int[]{1, 2});
        runCase("all second values smaller", solver, new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3, new int[]{1, 2, 3, 4, 5, 6});
        runCase("interleaving merge", solver, new int[]{1, 2, 4, 0, 0, 0}, 3, new int[]{3, 5, 6}, 3, new int[]{1, 2, 3, 4, 5, 6});
        runCase("many duplicates", solver, new int[]{2, 2, 3, 0, 0, 0}, 3, new int[]{1, 2, 2}, 3, new int[]{1, 2, 2, 2, 2, 3});
        runCase("negative numbers", solver, new int[]{-3, -1, 2, 0, 0, 0}, 3, new int[]{-2, 0, 1}, 3, new int[]{-3, -2, -1, 0, 1, 2});
        runCase("all copied from nums2", solver, new int[]{0, 0, 0}, 0, new int[]{2, 5, 6}, 3, new int[]{2, 5, 6});
        runCase("single append at end", solver, new int[]{1, 0}, 1, new int[]{2}, 1, new int[]{1, 2});
        runCase("single equal append", solver, new int[]{2, 0}, 1, new int[]{2}, 1, new int[]{2, 2});
        runCase("three values merged into one", solver, new int[]{3, 0, 0, 0}, 1, new int[]{1, 2, 4}, 3, new int[]{1, 2, 3, 4});
        runCase("second array belongs at front", solver, new int[]{5, 6, 7, 0, 0}, 3, new int[]{1, 2}, 2, new int[]{1, 2, 5, 6, 7});
        runCase("mixed duplicates and zeroes", solver, new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0}, 6, new int[]{1, 2, 2}, 3, new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3});
        runCase("all second values larger", solver, new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{4, 5, 6}, 3, new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("MergeSortedArrayTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, MergeSortedArray solver, int[] nums1, int m, int[] nums2, int n, int[] expected) {
        int[] workingNums1 = Arrays.copyOf(nums1, nums1.length);
        int[] workingNums2 = Arrays.copyOf(nums2, nums2.length);
        solver.merge(workingNums1, m, workingNums2, n);
        assertArrayEquals(name, expected, workingNums1);
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
