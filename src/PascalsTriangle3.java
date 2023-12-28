import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle3 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = i - 1; j > 0; j--) {
                row.set(j, (row.get(j - 1) + row.get(j)));
            }
            row.add(1);
        }
        return row;
    }
}