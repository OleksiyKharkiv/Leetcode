import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int value: nums){
            set.add(value);
        }
        int index = 0;
        int k = 0;
        for (Integer value: set){
            nums[index] = value;
            index++;
            k++;
        }
        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
        for (int i = 0; i < nums.length; i++){
            System.out.print (" " + nums[index]);
        }
        return k;
    }
}