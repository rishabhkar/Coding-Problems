public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    // Linear scan: return existing index or the first position where target can be inserted.
    int i;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      } else {
        if (target < nums[i]) {
          return i;
        }
      }
    }
    return i;
  }
}
