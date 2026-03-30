public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {

    // Case 1: If array length is 0 (bypassing constraints) -> Return empty string
    if (strs == null || strs.length == 0) return "";

    // Case 2: Usual case
    StringBuilder sb = new StringBuilder();
    String prefix = strs[0];

    for (String value : strs) {

      int len = Math.min(prefix.length(), value.length());


      for (int i = 0; i < len; i++) {
        if (prefix.charAt(i) == value.charAt(i)) {
          sb.append(prefix.charAt(i));
        } else break;
      }
      prefix = sb.toString();
      sb = new StringBuilder();
    }

    return prefix;
  }
}
