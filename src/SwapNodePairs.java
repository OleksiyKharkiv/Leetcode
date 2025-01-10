public class SwapNodePairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null && curr.next != null){
            ListNode second = curr.next;
            ListNode nextPair = curr.next.next;
            second.next = curr;
            curr.next = nextPair;
            prev.next = second;

            prev = curr;
            curr = nextPair;

        }
        return dummy.next;
    }

}
