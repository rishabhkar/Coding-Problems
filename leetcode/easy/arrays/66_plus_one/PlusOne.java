public class PlusOne {
  public int[] plusOne(int[] digits) {
    // Case 1: Add from the back.
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i] = digits[i] + 1;
        return digits;
      } else {
        // Case 2: 9 turns into 0 and carry continues.
        digits[i] = 0;
      }
    }

    // Case 3: All digits were 9 -> result has one extra digit.
    int[] resultDigits = new int[digits.length + 1];
    resultDigits[0] = 1;
    return resultDigits;
  }
}
