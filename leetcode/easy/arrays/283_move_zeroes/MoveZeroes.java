public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    if (nums.length == 1) return;

    for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length; j++) {

      if (nums[i] == 0) {
        // Find the next non-zero and swap it into position i.
        if (nums[j] != 0) {
          nums[i] = nums[j];
          nums[j] = 0;
          i++;
          j = i;
        }
      } else if (nums[i] != 0) {
        // Current value is already fine; advance i.
        i++;
        j = i;
      }
    }
  }
}
