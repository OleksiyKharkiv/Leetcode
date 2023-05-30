import java.util.ArrayList;
import java.util.List;

public class MiddleOfKinkedList {

        public static class ListNode {
            int val;
            ListNode next;

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
        public ListNode middleNode(ListNode head) {
            List<ListNode> sourceList = new ArrayList<>();

            while (head != null){
                sourceList.add(head);
                head = head.next;
            }
            int middleNode = sourceList.size()/2+1;
            List<ListNode> subList = sourceList.subList(middleNode, sourceList.size());
            List<ListNode> newList = new ArrayList<>(subList);
            return (ListNode) newList;
        }
    }