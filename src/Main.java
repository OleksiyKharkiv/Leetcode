public class Main {
    public static void main(String[] args) {
        MiddleOfLinkedList mid = new MiddleOfLinkedList();
        MiddleOfLinkedList.ListNode head = new MiddleOfLinkedList.ListNode(1);
        head.next = new MiddleOfLinkedList.ListNode(2);
        head.next.next = new MiddleOfLinkedList.ListNode(3);
        head.next.next.next = new MiddleOfLinkedList.ListNode(4);
        head.next.next.next.next = new MiddleOfLinkedList.ListNode(5);

        mid.middleNode(head);

        MaximumWealth maximumWealth = new MaximumWealth();
        int[][] accounts = {
                {1, 2, 3, 4},
                {2, 3, 4, 12},
                {3, 4, 5, 6}
        };
        int wealth = maximumWealth.maximumWealth(accounts);
        System.out.println("Wealth is:  " + wealth);

        TwoSumHashMap twoSumHashMap = new TwoSumHashMap();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int res[] = twoSumHashMap.twoSum(nums, target);
        System.out.println("Result: [" + res[0] + "," + res[1] + "]");
    }
}