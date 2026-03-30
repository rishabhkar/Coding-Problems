public class StringToIntegerAtoi {
  public int myAtoi(String s) {

    // Case 1: String is null (Ignoring constraints) -> Return 0
    if (s == null) return 0;

    // Case 2: If string length is 0 -> Return 0
    if (s.isBlank()) return 0;

    // Case 3: Usual case
    //         - Remove leading whitespaces and zeros
    //         - Take care of the positive or negative sign
    //         - If no digit is read, result is 0
    //         - Round to nearest bound if it goes out of integer bound
    //         - Stop reading after non-numeric characters are encountered
    StringBuilder str = new StringBuilder();
    ArrayList<Integer> numerics = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numerics.add(i);
    }
    boolean isNegative = false;
    boolean signSeen = false;


    // Parse and append values to builder
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      // skip only leading spaces
      if (ch == ' ' && !signSeen && str.isEmpty()) continue;

      // allow only one sign before digits
      if ((ch == '+' || ch == '-') && !signSeen && str.isEmpty()) {
        signSeen = true;
        if (ch == '-') isNegative = true;
        continue;
      }

      try {
        if (numerics.contains(Integer.valueOf(String.valueOf(ch)))) {
          str.append(ch);
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        break;
      }
    }


    // Conversion and return
    try {
      if (!str.toString().isEmpty() && !isNegative) return Integer.valueOf(str.toString());
      else if (!str.toString().isEmpty() && isNegative) return -1 * Integer.valueOf(str.toString());
      else return 0;
    } catch (NumberFormatException e) {
      if (isNegative) return Integer.MIN_VALUE;
      else return Integer.MAX_VALUE;
    }
  }
}
