public class MergeTwoSortedLists {
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

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    // Case 1: If List 1 and List 2 both are null -> Return new linked list
    if (list1 == null && list2 == null) return null;

    // Case 2: If List 1 is not null and List 2 is null -> Return List 1
    if (list1 != null && list2 == null) return list1;

    // Case 3: If List 1 is null and List 2 is not null -> Return List 2
    if (list1 == null && list2 != null) return list2;

    // Case 4: Usual case mentioned in the question
    ListNode pointer1 = list1;
    ListNode pointer2 = list2;
    ListNode newHead = new ListNode();
    ListNode previousNode = newHead;

    while (pointer1 != null && pointer2 != null) {

      if (pointer1.val < pointer2.val) {

        ListNode newNode = new ListNode(pointer1.val);
        previousNode.next = newNode;
        previousNode = newNode;
        pointer1 = pointer1.next;

      } else if (pointer1.val >= pointer2.val) {

        ListNode newNode = new ListNode(pointer2.val);
        previousNode.next = newNode;
        previousNode = newNode;
        pointer2 = pointer2.next;
      }
    }

    while (pointer1 != null) {
      ListNode newNode = new ListNode(pointer1.val);
      previousNode.next = newNode;
      previousNode = newNode;
      pointer1 = pointer1.next;
    }

    while (pointer2 != null) {
      ListNode newNode = new ListNode(pointer2.val);
      previousNode.next = newNode;
      previousNode = newNode;
      pointer2 = pointer2.next;
    }

    return newHead.next;
  }
}
