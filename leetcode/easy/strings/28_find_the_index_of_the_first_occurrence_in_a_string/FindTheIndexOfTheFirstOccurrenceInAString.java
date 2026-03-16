public class FindTheIndexOfTheFirstOccurrenceInAString {
  public int strStr(String haystack, String needle) {

    // Case 1: If haystack is null (bypassing constraints) -> Throw new Illegal Argument Exception
    // Case 2: If haystack and needle both are null (bypassing constraints) -> Throw new Illegal
    // Argument Exception
    if (haystack == null || haystack.isEmpty()
        || (haystack == null && needle == null)) throw new IllegalArgumentException("Main / Target string " +
        "is null or empty. ");


    // Case 3: If needle is null (bypassing constraints) -> Return -1
    if (needle == null || needle.isEmpty()) return -1;

    // Case 4: If haystack directly matches needle -> Return 0
    if (haystack.equals(needle)) return 0;

    int subStrLength = needle.length();

    // Case 5: Usual case mentioned in the question
    if (haystack.contains(needle)) {

      for (int i = 0; i + subStrLength < haystack.length(); i++) {

        if (needle.equals(haystack.substring(i, i + subStrLength))) return i;

      }
    }
    return -1;
  }
}
