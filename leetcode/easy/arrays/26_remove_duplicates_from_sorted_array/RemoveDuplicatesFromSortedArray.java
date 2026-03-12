public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {

    // Non-Constraint:
    if (nums.length == 0) return 0;

    // Case 1: If size of nums is 1
    if (nums.length == 1) return 1;

    // Case 2: Usual case present in question

    int reader = 0;
    int writer = 1;
    int count = 1;

    while (writer < nums.length) {
        if (nums[reader] < nums[writer]) {
          nums[reader + 1] = nums[writer];
          reader++;
          count++;
        }
        writer++;
      }
      return count;
    }

}
