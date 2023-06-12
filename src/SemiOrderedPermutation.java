public class SemiOrderedPermutation {
    public int semiOrderedPermutation(int[] nums) {
        int tempMin = nums[0];
        int tempMax = nums[nums.length-1];
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] <= tempMin){
                tempMin = nums[i];
            }
            else if (nums[i] >= tempMax){
                tempMax = nums[i];
            }
        }
//
        while (nums[0] != tempMin && nums[nums.length-1]!=tempMax){
            for (int k = 0; k < nums.length-1; k++){
                if (nums[k] > nums[k+1]){
                    swap(nums, k, k+1);
                    count ++;
                }
            }
            if (nums[0] > nums[1]){
                swap(nums, 0, 1);
                count ++;
            }
            if (nums[nums.length - 2] > nums[nums.length - 1]){
                swap(nums, nums.length-2, nums.length-1);
                count ++;
            }
        }

        return count;
    }

    public static void swap (int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}