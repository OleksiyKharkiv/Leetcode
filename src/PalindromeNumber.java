public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        char[] charArr = strX.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        if (right == 0) {
            return true;
        } else {
            while (left < right) {
                if (charArr[left] != charArr[right]) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
            return true;
        }
    }
}