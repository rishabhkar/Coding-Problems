public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    // Case 1: Linear scan.
    int insertionIndex;

    for (insertionIndex = 0; insertionIndex < nums.length; insertionIndex++) {
      // Case 2: Found exact match.
      if (nums[insertionIndex] == target) return insertionIndex;

      // Case 3: First bigger number -> this is the insert position.
      if (target < nums[insertionIndex]) return insertionIndex;
    }

    return insertionIndex;
  }
}
