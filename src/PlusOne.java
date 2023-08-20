public class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length -1;
        boolean allNines = true;
        for (int num: digits){
            if (num != 9) {
                allNines = false;
                break;
            }
        }
        if (allNines){
            int [] plusOne = new int[digits.length +1];
            plusOne [0] = 1;
            return plusOne;
        }
        if (digits[i] < 9){
            digits[i]++;
            return digits;
        }
        else {
            digits[i] = 0;
            int carry = 1;
            i--;
            while (i >= 0 && digits[i] == 9) {
                digits[i] = (digits[i] + carry)%10;
                i--;
            }
            if (i >= 0){
                digits[i] = digits[i] +1;
            }
            return digits;
        }

    }
}