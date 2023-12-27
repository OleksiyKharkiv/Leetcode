import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < (i + 1); j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(listOfLists.get(i - 1).get(j - 1) + listOfLists.get(i - 1).get(j));
                }
            }
            listOfLists.add(row);
        }
        return listOfLists;
    }
}