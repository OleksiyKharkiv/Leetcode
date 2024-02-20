public class IntersectionOfTwoLinkedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode currentA = headA;
            ListNode currentB = headB;
            while (currentA != null) {
                currentB = headB;
                while (currentB != null) {
                    if (currentA == currentB) {
                        return currentA;
                    } else currentB = currentB.next;
                }
                currentA = currentA.next;
            }
            return null;
        }
    }
}