public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {

    // Case 1: Array passed is null or length is zero (bypassing constraints) -> Throw new Illegal
    // Argument Exception
    if (nums == null || nums.length == 0) throw new IllegalArgumentException("Parameter passed is either " +
        "null or empty.");

    // Case 2: Usual case mentioned in the question
    Map<Integer, Integer> map = new HashMap<>();

    for (int value : nums) {

      if (!map.containsKey(value)) map.put(value, null);
      else return true;

    }
    return false;
  }
}
