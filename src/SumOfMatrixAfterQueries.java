public class SumOfMatrixAfterQueries {
    public long matrixSumQueries(int n, int[][] queries) {

        int[][] matrix = new int[n][n];
        long sum = 0;

        for (int q = 0; q < queries.length; q++) {
            int type = queries[q][0];
            int index = queries[q][1];
            int val = queries[q][2];
            if (type == 0) {
                for (int i = 0; i < n; i++) {
                    matrix[index][i] = val;
                }
            } else if (type == 1) {
                for (int i = 0; i < n; i++) {
                    matrix[i][index] = val;
                }

            }
        }

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        System.out.println("Matrix sum is: " + sum);
        return sum;
    }
}