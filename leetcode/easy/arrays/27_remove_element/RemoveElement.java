public class RemoveElement {
  public int removeElement(int[] nums, int val) {

    // Case 0: If nums length is 0 -> Return 0
    if (nums.length == 0) return 0;

    // Case 1: If nums length is 1 & nums[0] is not val -> Return 1
    if (nums.length == 1 && nums[0] != val) return 1;

      // Case 2: If nums length is 1 & nums[0] is equal to val -> Return 0
    else if (nums.length == 1 && nums[0] == val) return 0;

    // Case 3: Usual case -> Remove elements equal to val -> Shift rest of elements to left
    // -> Return count

    int left = 0;
    int right = nums.length - 1;
    int count = 0;

    while (left <= right) {

      if (nums[left] == val) {
        nums[left] = nums[right];
        right--;
      } else {
        left++;
        count++;
      }
    }
    return count;
  }
}
