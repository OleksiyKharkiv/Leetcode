import java.util.*;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : nums) {
            if (map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count + 1);
            } else {
                map.put(element, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));

        int res = entryList.get(0).getKey();
        return res;
    }
}