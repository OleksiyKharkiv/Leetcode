public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] == target || (nums[0] > target)) {
            return 0;
        }
        if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        } else {
            int left = 0;
            int right = nums.length - 2;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (nums[middle] == target) {
                    return middle;
                }
                if (target < nums[middle] && target > nums[middle - 1]) {
                    return middle;
                }
                if (target > nums[middle] && target < nums[middle + 1]) {
                    return middle + 1;
                } else if (nums[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle;
                }
            }
            return -1;
        }
    }
}