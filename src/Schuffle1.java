public class Schuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
                x--;
                System.out.print("-");
            }
            if (x == 2) {
                System.out.print("b c");
                x--;
                System.out.print("-");
            }
            if (x == 1) {
                System.out.print("d");
                x--;
            }
        }
    }
}