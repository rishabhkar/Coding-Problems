public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    // Case 1: One element -> nothing to move.
    if (nums.length == 1) return;

    // Case 2: Two pointers.
    // leftPointer -> where the next non-zero should go.
    // scanPointer -> scans ahead looking for the next non-zero.
    for (int leftPointer = 0, scanPointer = 1;
         leftPointer < nums.length - 1 && scanPointer < nums.length;
         scanPointer++) {

      // Case 3: Current slot is zero -> swap in the next non-zero.
      if (nums[leftPointer] == 0) {
        if (nums[scanPointer] != 0) {
          nums[leftPointer] = nums[scanPointer];
          nums[scanPointer] = 0;
          leftPointer++;
          scanPointer = leftPointer;
        }
      } else {
        leftPointer++;
        scanPointer = leftPointer;
      }
    }
  }
}
