package easy.linked_list._83_remove_duplicates_from_sorted_list;

public class RemoveDuplicatesFromSortedList {

  static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode deleteDuplicates(ListNode head) {

    // Case 1: If head is null -> Return null
    if (head == null) return null;

    // Case 2: Usual case mentioned in the question
    ListNode temporaryPointer = head;
    ListNode p = temporaryPointer.next;

    while (p != null) {
      if (temporaryPointer.val == p.val) {
        p = p.next;
      } else {
        temporaryPointer.next = p;
        temporaryPointer = p;
        p = p.next;
      }
    }

    temporaryPointer.next = null;

    return head;
  }
}
