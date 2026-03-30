public class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {

    // Case 1: If string length is 1 -> Return string itself
    if (s.length() == 1) return s;

    // Case 2: Usual Implementation
    //         - Create sliding window
    //         - Check if palindrome within the window
    //         - Check if string length is longest, return

    StringBuilder bestString = new StringBuilder();
    int best = 0;

    for (int left = 0; left < s.length(); left++) {
      for (int right = left; right < s.length(); right++) {
        String current = s.substring(left, right + 1);

        if (palindromeChecker(current)) {
          if (current.length() > best) {
            bestString = new StringBuilder(current);
            best = current.length();
          }
        }
      }
    }

    return bestString.toString();
  }

  public boolean palindromeChecker(String str) {

    for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
      if (str.charAt(i) != str.charAt(j)) return false;
    }
    return true;
  }
}


