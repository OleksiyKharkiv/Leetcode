public class AddDigits {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            num = (num - 1) % 9 + 1;
        }
        return num;
    }
}
