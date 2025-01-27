package FiveMinArrayMembers;

public class Bank {
    String customerName;
    static int account;
}

class Main {
    public static void main(String[] args) {
        Bank citiBank = new Bank();
        Bank deutscheBank = new Bank();

        citiBank.customerName = "c";
        deutscheBank.customerName = "d";

        Bank.account = 1111;
    }
}