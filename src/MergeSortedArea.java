import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class MergeSortedArea {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && nums1[0] == 0 && n == 1) {
            nums1[0] = nums2[0];
        } else {
            Queue<Integer> queue = new ArrayDeque<>();
            int i = 0;
            int j = 0;
            while (i < m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    queue.add(nums1[i]);
                    i++;
                } else {
                    queue.add(nums2[j]);
                    j++;
                }
            }
            if (i < m) {
                while (i < m) {
                    queue.add(nums1[i]);
                    i++;
                }
            }
            if (j < n) {
                while (j < n) {
                    queue.add(nums2[j]);
                    j++;
                }
            }
            for (int q = 0; q < m + n; q++) {
                nums1[q] = Objects.requireNonNull(queue.poll());
            }
        }
    }
}