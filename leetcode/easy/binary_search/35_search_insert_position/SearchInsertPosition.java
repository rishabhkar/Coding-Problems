import java.util.*;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        // Case 1: If array passed is null or empty (bypassing constraints) -> Throw Illegal Argument
      // Exception
        if (nums.length == 0 || nums == null) throw new IllegalArgumentException("Array passed is empty");

      // Case 2: Usual case
      int indexFound = Integer.MIN_VALUE;
      int[] temporaryNums = nums;
      int left = 0;
      int right = temporaryNums.length-1;

      while (left < right) {

        int mid = (left + right) / 2;

        if (mid == target) indexFound = mid;
        else if (target < mid) {
          right = mid - 1;
//          temporaryNums = Arrays.copyOf(nums, )
          // Currently on hold
        }

      }

      return indexFound;
    }

}
