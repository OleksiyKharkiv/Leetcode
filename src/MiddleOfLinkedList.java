import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public List<ListNode> middleNode(ListNode head) {
        List<ListNode> sourceList = new ArrayList<>();

        while (head != null) {
            sourceList.add(head);
            head = head.next;
        }
        int middleNode = sourceList.size() / 2 + 1;
        List<ListNode> subList = sourceList.subList(middleNode, sourceList.size());
        List<ListNode> newList = new ArrayList<>(subList);
        return newList;
    }

}