package GuessGame;

public class Player {
    String name;
    int number;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I think it's " + number);
    }
}
