public class LinkedListCycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
        public boolean hasCycle(MiddleOfLinkedList.ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }

            MiddleOfLinkedList.ListNode turtle = head;
            MiddleOfLinkedList.ListNode hare = head;

            while (hare != null && hare.next != null) {
                turtle = turtle.next;
                hare = hare.next.next;

                if (turtle == hare) {
                    return true; // Найден цикл
                }
            }

            return false; // Цикл не найден
        }
    }