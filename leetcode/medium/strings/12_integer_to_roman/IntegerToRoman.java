import java.util.*;

public class IntegerToRoman {
  public String intToRoman(int num) {
    // Case 1: Num is zero (bypassing constraints)
    if (num == 0) return "";

    // Case 2: Usual case
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    map.put(1000, "M");
    map.put(900, "CM");
    map.put(500, "D");
    map.put(400, "CD");
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");

    StringBuilder sb = new StringBuilder();
    int res = num;

    while (res > 0) {

      for (Map.Entry<Integer, String> entry : map.entrySet()) {
        if (res >= entry.getKey()) {
          sb.append(entry.getValue());
          res -= entry.getKey();
          break;
        }
      }
    }

    return sb.toString();
  }
}

