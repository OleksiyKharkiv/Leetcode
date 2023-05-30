public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MiddleOfLinkedList mid = new MiddleOfLinkedList();

        MiddleOfLinkedList.ListNode head = new MiddleOfLinkedList.ListNode(1, null);
        head.next = new MiddleOfLinkedList.ListNode(2, null);
        head.next.next = new MiddleOfLinkedList.ListNode(3, null);
        head.next.next.next = new MiddleOfLinkedList.ListNode(4, null);
        head.next.next.next.next = new MiddleOfLinkedList.ListNode(5, null);

        mid.middleNode(head);

        MaximumWealth maximumWealth = new MaximumWealth();
        int[][] accounts = {
                {1,2,3,4},
                {2,3,4,12},
                {3,4,5,6}
        };
        int wealth = maximumWealth.maximumWealth(accounts);
        System.out.println("Wealth is:  " + wealth);

    }
}