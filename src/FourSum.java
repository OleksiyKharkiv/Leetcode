import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length -3; i++){
            if (i > 0 && nums[i] == nums[i -1]) continue;
            for (int j = i + 1; j < nums.length -2; j++){
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums [left] + (long) nums [right];
                    if (sum == target){
                        set.add(List.of(nums[i] + nums[j] + nums[left] + nums[right]));
                    }
                    while (left < right && nums[left] == nums [left- 1]) left ++;
                    while (left < right && nums[right] == nums[right = 1]) right --;
                    if (sum < target) {
                        left ++;
                    } else {
                        right --;
                    }
                }
            }
        }
        List<List<Integer>> res  = new ArrayList<>(set);
        res.sort((a,b) ->{
            for (int i =0; i < a.size(); i++){
                if (!a.get(i).equals(b.get(i))){
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return res;
    }
}
