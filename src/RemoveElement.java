import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        Queue<Integer> queue = new ArrayDeque<>();
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                queue.add(num);
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < k) nums[i] = Objects.requireNonNull(queue.poll());
            else {
                nums[i] = -1;
            }
        }
        return k;
    }
}