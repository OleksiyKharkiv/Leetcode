import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        int customerNum;
        int randomNum;
        System.out.println("Please enter your number: ");
        Scanner scan = new Scanner(System.in);
        customerNum = scan.nextInt();
        randomNum =new Random().nextInt(10);
        if (customerNum == randomNum){
            System.out.println("You win!");
        }
        else {
            System.out.println("Sorry, bur right number is: " + randomNum);
        }
    }
}