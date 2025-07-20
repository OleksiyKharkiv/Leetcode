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
class Solution {
    private ListNode left;

    public void reorderList(ListNode head) {
        left = head;
        dfs(head);
    }

    private void dfs(ListNode right) {
        if (right == null) return;

        dfs(right.next);
        if (left == null) return;

        if (left == right || left.next == right) {
            right.next = null;
            left = null;
            return;
        }
        ListNode tmp = left.next;
        left.next = right;
        right.next = tmp;
        left = tmp;
    }
}