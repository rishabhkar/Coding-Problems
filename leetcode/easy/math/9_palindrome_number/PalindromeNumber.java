public class PalindromeNumber {
  public boolean isPalindrome(int x) {

    // Case 1: Number is single digit -> Return true if positive
    if (x < 10 && x >= 0) return true;

    // Case 2: If number is negative -> Return false straight away because minus sign can only exist
    // in the beginning
    if (x < 0) return false;

    // Case 3: Usual case -> Convert to String -> Check both ends -> Return value
    String str = String.valueOf(x);

    for (int i=0, j=str.length()-1; i<j; i++, j--) {
      if (str.charAt(i) != str.charAt(j)) return false;
    }
    return true;
  }
}
