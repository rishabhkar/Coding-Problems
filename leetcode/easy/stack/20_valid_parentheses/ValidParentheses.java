import java.util.*;

public class ValidParentheses {
  public boolean isValid(String input) {

    // Case 1: Odd length strings can never be valid.
    if (input.length() % 2 != 0) return false;

    Stack<Character> openBrackets = new Stack<>();

    for (int i = 0; i < input.length(); i++) {

      char currentChar = input.charAt(i);

      // Case 2: Opening bracket -> store for later matching.
      if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
        openBrackets.push(currentChar);
      } else {
        // Case 3: Closing bracket -> must match the last opening bracket.
        if (openBrackets.isEmpty()) return false;

        if (currentChar == ')' && openBrackets.peek() == '(') openBrackets.pop();
        else if (currentChar == '}' && openBrackets.peek() == '{') openBrackets.pop();
        else if (currentChar == ']' && openBrackets.peek() == '[') openBrackets.pop();
        else return false;
      }

    }

    return openBrackets.isEmpty();
  }
}
