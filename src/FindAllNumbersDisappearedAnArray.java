import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindAllNumbersDisappearedAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> setOrder = new TreeSet<>();
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            setOrder.add(i + 1);
            set.add(nums[i]);
        }
        setOrder.removeAll(set);
        res.addAll(setOrder);
        return res;
    }
}