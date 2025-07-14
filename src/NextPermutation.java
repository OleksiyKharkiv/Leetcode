public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            System.out.println("Array is immutable");
        }
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);

    }

    private void swap(int[] nums, int i, int j) {
        QuickSort.swap(nums, i, j);
    }

    private void reverse(int[] nums, int start) {
        int j = nums.length - 1;
        while (start < j) {
            swap(nums, start, j);
            start++;
            j--;
        }
    }
}