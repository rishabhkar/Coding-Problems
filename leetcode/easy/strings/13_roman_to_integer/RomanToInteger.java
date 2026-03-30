import java.util.*;

public class RomanToInteger {
  public int romanToInt(String s) {

    // Case 1: String passed is null (bypassing constraint)
    if (s == null) return 0;

    // Case 2: Usual case
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    map.put("M", 1000);
    map.put("CM", 900);
    map.put("D", 500);
    map.put("CD", 400);
    map.put("C", 100);
    map.put("XC", 90);
    map.put("L", 50);
    map.put("XL", 40);
    map.put("X", 10);
    map.put("IX", 9);
    map.put("V", 5);
    map.put("IV", 4);
    map.put("I", 1);

    int res = 0;
    s = s.toUpperCase();

    for (int i = 0; i < s.length(); i++) {

      if (!(i + 1 >= s.length())) {
        String checkDouble = String.valueOf("" + s.charAt(i) + s.charAt(i + 1));
        if (map.containsKey(checkDouble)) {
          res = res + map.get(checkDouble);
          i++;
          continue;
        }
      }
      if (map.containsKey(String.valueOf(s.charAt(i)))) {
        res = res + map.get(String.valueOf(s.charAt(i)));
      }
    }

    return res;
  }
}
