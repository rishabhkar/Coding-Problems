package easy.linked_list._141_linked_list_cycle;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        // Case 1: If head == null or head.next == null
        if (head == null || head.next == null) {
            return false;
        }

        // Case 2: Usual case mentioned in the question
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }

        return false;
    }
}
