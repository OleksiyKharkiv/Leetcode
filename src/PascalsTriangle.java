import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows < 1) {
            return null;
        }
        List<List<Integer>> generate = new ArrayList<>();
        if (numRows == 1) {
            List<Integer> list0 = new ArrayList<>();
            list0.add(1);
            generate.add(list0);
            return generate;
        } else {


            List<Integer> list0 = new ArrayList<>();
            list0.add(1);
            generate.add(list0);
            for (int i = 1; i < numRows; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        list.add(1);
                    } else {
                        list.add(j, generate.get(i - 1).get(j - 1) + generate.get(i - 1).get(j));
                    }
                }
                generate.add(list);
            }
            return generate;
        }
    }
}