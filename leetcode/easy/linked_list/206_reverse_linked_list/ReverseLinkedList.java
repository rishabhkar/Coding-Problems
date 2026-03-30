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
    // Case 1: Iterative in-place reversal.
    ListNode reversedListHead = null;

    // Case 2: Walk the list and flip pointers.
    ListNode currentNode = head;
    while (currentNode != null) {
      ListNode nextNode = currentNode.next;
      currentNode.next = reversedListHead;
      reversedListHead = currentNode;
      currentNode = nextNode;
    }

    return reversedListHead;
  }
}

