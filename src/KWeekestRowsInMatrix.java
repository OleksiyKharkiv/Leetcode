import java.util.*;
import java.util.Map.Entry;

public class KWeekestRowsInMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        int numSoldiers;
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            numSoldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                numSoldiers += mat[i][j];
            }
            res.put(i, numSoldiers);
        }
        List<Map.Entry<Integer, Integer>> rating = new ArrayList<>(res.entrySet());

        Comparator<Map.Entry<Integer, Integer>> comparator = Comparator
                .comparing(Map.Entry<Integer, Integer>::getValue)
                .thenComparing(Entry::getKey);

        rating.sort(comparator);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rating.get(i).getKey();
        }
        return result;
    }
}