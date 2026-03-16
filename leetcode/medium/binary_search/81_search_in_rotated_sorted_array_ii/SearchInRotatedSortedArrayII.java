public class SearchInRotatedSortedArrayII {
  public boolean search(int[] nums, int target) {

    // Case 1: If array is null (bypassing constraints) -> Return false
    if (nums == null || nums.length == 0) return false;

    // Case 2: Single element array and target matching -> Return true
    if (nums.length == 1 && nums[0] == target) return true;

    // Case 3: Single element array and target not matching -> Return false
    if (nums.length == 1 && nums[0] != target) return false;

    // Case 4: Usual case
    // Identify the pivot
    int pivotIndex = 0;
    while (pivotIndex + 1 < nums.length) {
      if (nums[pivotIndex + 1] < nums[pivotIndex]) {
        break;
      } else pivotIndex++;
    }

    return binarySearch(nums, target, 0, pivotIndex)
        || binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
  }

  public boolean binarySearch(int[] nums, int target, int left, int right) {

    while (left <= right) {
      int mid = (left + right) / 2;

      if (target == nums[mid]) {
        return true;
      } else if (target > nums[mid]) {
        left = mid + 1;
      } else if (target < nums[mid]) {
        right = mid - 1;
      }
    }

    return false;
  }
}
