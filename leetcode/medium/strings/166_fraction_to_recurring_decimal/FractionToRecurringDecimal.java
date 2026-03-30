import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
  public String fractionToDecimal(int numerator, int denominator) {
    long numeratorValue = numerator;
    long denominatorValue = denominator;

    // Case 1: Numerator is 0.
    if (numeratorValue == 0) return "0";

    StringBuilder decimalValue = new StringBuilder();

    // Case 2: Sign handling.
    if ((numeratorValue < 0) ^ (denominatorValue < 0)) decimalValue.append("-");
    numeratorValue = Math.abs(numeratorValue);
    denominatorValue = Math.abs(denominatorValue);

    decimalValue.append(numeratorValue / denominatorValue);

    long remainder = numeratorValue % denominatorValue;

    // Case 3: No fractional part.
    if (remainder == 0) return decimalValue.toString();

    decimalValue.append(".");

    // remainder -> index in string where this remainder first appeared.
    Map<Long, Integer> remainderIndexByRemainder = new HashMap<>();

    while (remainder != 0) {
      if (remainderIndexByRemainder.containsKey(remainder)) {
        int repeatStartIndex = remainderIndexByRemainder.get(remainder);
        decimalValue.insert(repeatStartIndex, '(');
        decimalValue.append(')');
        break;
      }

      remainderIndexByRemainder.put(remainder, decimalValue.length());

      remainder *= 10;
      // Next digit in long division.
      decimalValue.append(remainder / denominatorValue);
      remainder %= denominatorValue;

    }
    return decimalValue.toString();
  }
}
