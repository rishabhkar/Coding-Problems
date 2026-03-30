/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    // Iterative in-place reversal.
    ListNode newHead = null;

    while (head != null) {
      // Standard pointer flip.
      ListNode next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }

    return newHead;
  }
}

