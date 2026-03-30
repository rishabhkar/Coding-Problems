public class PlusOne {
  public int[] plusOne(int[] digits) {
    // Add from the back, handling carry.
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i] = digits[i] + 1;
        return digits;
      } else {
        // Carry continues.
        digits[i] = 0;
      }
    }
    // If we got here, digits was all 9s (e.g. 9 -> 10, 99 -> 100).
    int[] arr = new int[digits.length + 1];
    arr[0] = 1;
    return arr;
  }
}
