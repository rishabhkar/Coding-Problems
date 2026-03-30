public class ReverseInteger {
  public int reverse(int x) {

    // Case 1: If x is 0 ->Return 0
    if (x == 0) return 0;

    // Case 2: Usual case -> Modulo by 10 -> Add to Stringbuilder -> Convert back to Int

    StringBuilder sb = new StringBuilder();
    int res = x;
    if (res < 0) {
      res = res * -1;
    }

    while (res > 0) {
      int val = res % 10;
      res = res / 10;
      sb.append(val);
    }

    try {
      if (x < 0) return -1 * Integer.parseInt(sb.toString());
      else return Integer.parseInt(sb.toString());
    } catch (Exception e) {
      return 0;
    }
  }
}
