public class MatrixAfterQueries {
    public int matrixQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];
        int sum = 0;

        for (int[] query : queries) {
            int type = query[0];
            int index = query[1];
            int val = query[2];

            if (type == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[index][j] += val;
                    sum += matrix[index][j];
                }
            } else if (type == 1) {
                for (int i = 0; i < n; i++) {
                    matrix[i][index] += val;
                    sum += matrix[i][index];
                }
            }
        }

        return sum;
    }
}