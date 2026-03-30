/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      // Case 1: If L1 and L2 is null -> Return empty Linked List
      if (l1 == null && l2 == null) return new ListNode();

      // Case 2: If L1 is null -> Reverse L2 -> Return L2
      if (l1 == null & l2 != null) return reverseList(l2);

      // Case 3: If L2 is null -> Reverse L1 -> Return L1
      if (l1 != null & l2 == null) return reverseList(l1);


      // Case 4: Usual Case -> Add two Linked List -> Reverse result -> Return result
      // Use BigInteger to safely handle arbitrarily long numbers (avoid Long.parseLong overflow)
      BigInteger val1 = fetchLong(reverseList(l1));
      BigInteger val2 = fetchLong(reverseList(l2));

      BigInteger result = val1.add(val2);
      if (result.compareTo(BigInteger.TEN) < 0 && result.compareTo(BigInteger.ZERO) >= 0)
        return new ListNode(result.intValue());

      ListNode head = null;
      ListNode temporaryNode = null;

      while (result.compareTo(BigInteger.ZERO) > 0) {
        BigInteger[] dr = result.divideAndRemainder(BigInteger.TEN);
        int digit = dr[1].intValue();
        ListNode node = new ListNode(digit);

        if (head == null) {
          head = node;
          temporaryNode = head;
        } else {
          temporaryNode.next = node;
          temporaryNode = node;
        }
        result = dr[0];
      }

      return head;
    }

  public BigInteger fetchLong(ListNode head) {
    ListNode tempPointer = head;
    StringBuilder sb = new StringBuilder();
    while (tempPointer != null) {
      sb.append(tempPointer.val);
      tempPointer = tempPointer.next;
    }
    return new BigInteger(sb.toString());
  }

  public ListNode reverseList(ListNode head) {

    ListNode previous = null;
    ListNode current = head;

    while (current != null) {
      ListNode next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    return previous;
  }
}