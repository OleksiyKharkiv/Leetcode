public class DivideWithoutDivide {
    public int divide(int dividend, int divisor) {
        if (dividend  == 0 && divisor != 0 ){
            return 0;
        }
        if (dividend == Integer.MAX_VALUE && divisor == 1){
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1){
            return -Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if (divisor == 0){
            return -1;
        } else {
            int count = 0;
            int sum = 0;
            if (dividend > 0 && divisor > 0){
                while ( sum <= dividend){
                    sum = sum + divisor;
                    if (sum <= dividend){
                        count++;
                    }
                }
                return count;
            }
            if (dividend < 0 && divisor < 0){
                while ( sum >= dividend){
                    sum = sum + divisor;
                    if (sum >= dividend){
                        count++;
                    }
                }
                return count;
            }
            if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
                dividend = Math.abs(dividend);
                divisor = Math.abs(divisor);
                while ( sum <= dividend){
                    sum = sum + divisor;
                    if (sum <= dividend){
                        count++;
                    }
                }
                return -count;
            }
        }
        return 0;
    }
}
