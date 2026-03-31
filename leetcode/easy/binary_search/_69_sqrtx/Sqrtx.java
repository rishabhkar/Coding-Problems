package easy.binary_search._69_sqrtx;

public class Sqrtx {
  public int mySqrt(int x) {


    // Case 1: x is negative (bypassing constraints) -> Illegal Argument Exception
    if (x < 0) throw new IllegalArgumentException("Value passed is negative.");

    // Case 2: Edge cases
    if (x == 0 || x == 1) return x;

    // Case 3: Usual case mentioned in the question
    long left = 1;
    long right = x;
    long answer = 0;

    while (left <= right) {
      long value = left + (right - left) / 2;

      if (value * value == x) return (int) value;
      else if (value * value < x) {
        answer = value;
        left = value + 1;
      } else {
        right = value - 1;
      }
    }

    return (int) answer;
  }
}
