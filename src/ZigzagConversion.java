public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() == 1) return s;

        char[] charArr = s.toCharArray();
        int len = charArr.length;
        int cycleLength = 2 * numRows - 2;
        int numCols = (len + cycleLength - 1) / cycleLength * (numRows - 1);

        char[][] res = new char[numRows][numCols];
        int counter = 0;

        for (int i = 0; i < charArr.length-1; i++) {
            if (i == 0 || i % (numRows - 1) == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (counter < len) {
                        res[j][i] = charArr[counter];
                        counter++;
                    }
                }
            } else {
                int row = numRows - 1 - i%(numRows-1);
                if (counter < len) {
                    res[row][i] = charArr[counter];
                    counter++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char[] row : res) {
            for (char c : row) {
                if (c != '\u0000') {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
