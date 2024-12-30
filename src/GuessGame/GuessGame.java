package GuessGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1;
        int guessp2;
        int guessp3;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        System.out.println("I guess number from 0 to 9...");
        int targetNumber = (int) (Math.random() * 10);

        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("First player think that the number is " + guessp1);
            guessp2 = p2.number;
            System.out.println("Second player think that the number is " + guessp2);
            guessp3 = p3.number;
            System.out.println("Third player think that the number is " + guessp3);
            if (guessp1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessp2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessp3 == targetNumber) {
                p3IsRight = true;
            }
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner! I wished for the number " + targetNumber);
                System.out.println("Is that First player ? " + p1IsRight);
                System.out.println("Is that Second player ? " + p2IsRight);
                System.out.println("Is that Third player ? " + p3IsRight);
                break;
            } else {
                System.out.println("I wished for the number " + targetNumber + " We don't have a single winner! Let's continue!");
                System.out.println();
            }
        }
    }
}

