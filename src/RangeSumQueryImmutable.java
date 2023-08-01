public class RangeSumQueryImmutable {
    private int[] nums;

    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sumRange = 0;
        for (int i = left; i < right + 1; i++) {
            sumRange = sumRange + nums[i];
        }
        return sumRange;
    }
}