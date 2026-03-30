public class FractionToRecurringDecimal {
  public String fractionToDecimal(int numerator, int denominator) {
    long n = numerator;
    long d = denominator;

    if (n == 0)
      return "0";

    StringBuilder sb = new StringBuilder();
    // Sign handling.
    if ((n < 0) ^ (d < 0))
      sb.append("-");
    n = Math.abs(n);
    d = Math.abs(d);

    sb.append(n / d);

    long rem = n % d;

    if (rem == 0) {
      return sb.toString();
    } else {

      sb.append(".");
      // Map remainder -> index in string (where this remainder first appeared).
      Map<Long, Integer> seen = new HashMap<>();

      while (rem != 0) {
        if (seen.containsKey(rem)) {
          int idx = seen.get(rem);
          // Repeat detected: insert parentheses around the repeating block.
          sb.insert(idx, '(');
          sb.append(')');
          break;
        }

        seen.put(rem, sb.length());

        rem *= 10;
        // Next digit in long division.
        sb.append(rem / d); // next digit
        rem %= d;

      }
    }
    return sb.toString();
  }
}
