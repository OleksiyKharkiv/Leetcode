public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            int middle = 0;
            int left = 0;
            int right = x / 2;
            while (left <= right) {
                middle = left + (right - left) / 2;
                if ((long) middle * middle == x) {
                    return middle;
                } else if ((long) middle * middle < x) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            if ((long) middle * middle > x) {
                return middle - 1;
            } else {
                return middle;
            }
        }
    }
}