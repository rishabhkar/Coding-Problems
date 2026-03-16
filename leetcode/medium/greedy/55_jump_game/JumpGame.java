public class JumpGame {
  public boolean canJump(int[] nums) {
    // Case 1: If array is null (bypassing constraints) -> Return false
    // Case 2: If array length is zero (bypassing constraints) -> Return false
    if (nums == null || nums.length == 0) return false;

    // Case 3: If starting element is zero and length is 1 -> Return true as no jumps are needed
    // Case 4: If array length is more than 1 and element is 1 -> Return true
    if ((nums[0] == 0 || nums[0] == 1) && nums.length == 1) return true;

    // Case 5: If starting element is zero and length is not 1 -> No jumps can be made -> Return false
    else if (nums[0] == 0 && nums.length > 1) return false;

    // Case 4: Usual case
    int maxReach = 0;

    for (int i = 0; i < nums.length; i++) {
      if (i > maxReach) return false;

      maxReach = Math.max(maxReach, i + nums[i]);

      if (maxReach >= nums.length - 1) return true;
    }

    return true;
  }
}
