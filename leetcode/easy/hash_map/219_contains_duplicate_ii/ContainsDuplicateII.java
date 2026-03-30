public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

      // Case 1: Array passed is null or length is zero (bypassing constraints) or k < 0 -> Throw new Illegal
      // Argument Exception
      if (nums == null || nums.length == 0 || k < 0) throw new IllegalArgumentException("Parameter passed " +
          "is either null or empty or target < 0");

      // Case 2: Usual case mentioned in the question
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {

        if (!map.containsKey(nums[i])) map.put(nums[i], i);
        else {

          int j = map.get(nums[i]);
          if (Math.abs(i-j) <= k) return true;
          else map.put(nums[i], i);
        }
      }
      return false;
    }
}
