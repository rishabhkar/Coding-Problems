public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    // Case 1: String length is 0 -> Return 0
    // Case 2: String length is 1 -> Return 1
    if (s.length() == 0 || s.length() == 1) return s.length();

    // Case 3: Usual case -> Sliding Window -> Count values -> Return count
    int left = 0;
    int right = 0;
    int best = 1;

    while (right < s.length()) {

      int check = left;

      while (check < right) {
        if (s.charAt(check) == s.charAt(right)) {
          left = check + 1;
          break;
        } else check++;
      }
      best = Math.max(best, right - left + 1);
      right++;
    }
    return best;
  }
}
}
