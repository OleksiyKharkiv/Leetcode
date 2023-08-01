public class ReverseLinkedList {
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

    public MiddleOfLinkedList.ListNode reverseList(MiddleOfLinkedList.ListNode head) {
        MiddleOfLinkedList.ListNode prev = null;
        MiddleOfLinkedList.ListNode current = head;

        while (current != null) {
            MiddleOfLinkedList.ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}