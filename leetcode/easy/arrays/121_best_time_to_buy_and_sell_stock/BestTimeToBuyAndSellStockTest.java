import java.util.Arrays;

public class BestTimeToBuyAndSellStockTest {
    private static int testsRun = 0;

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solver = new BestTimeToBuyAndSellStock();
        runCase("official style profit", solver, new int[]{7, 1, 5, 3, 6, 4}, 5);
        runCase("strict decline", solver, new int[]{7, 6, 4, 3, 1}, 0);
        runCase("single day", solver, new int[]{1}, 0);
        runCase("two rising days", solver, new int[]{1, 2}, 1);
        runCase("two falling days", solver, new int[]{2, 1}, 0);
        runCase("small valley before rise", solver, new int[]{2, 4, 1}, 2);
        runCase("late recovery", solver, new int[]{2, 1, 2, 1, 0, 1, 2}, 2);
        runCase("multiple local peaks", solver, new int[]{3, 3, 5, 0, 0, 3, 1, 4}, 4);
        runCase("steady increase", solver, new int[]{1, 2, 3, 4, 5}, 4);
        runCase("best sale on final day", solver, new int[]{5, 4, 3, 2, 1, 6}, 5);
        runCase("large early profit", solver, new int[]{2, 10, 1, 5}, 8);
        runCase("buy at zero", solver, new int[]{0, 2}, 2);
        runCase("drop to zero then recover", solver, new int[]{2, 0, 2}, 2);
        runCase("classic mid array answer", solver, new int[]{3, 2, 6, 5, 0, 3}, 4);
        runCase("large rebound", solver, new int[]{9, 1, 9}, 8);
        System.out.println("BestTimeToBuyAndSellStockTest passed " + testsRun + " tests.");
    }

    private static void runCase(String name, BestTimeToBuyAndSellStock solver, int[] input, int expected) {
        int actual = solver.maxProfit(Arrays.copyOf(input, input.length));
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
