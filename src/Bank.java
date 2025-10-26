public class Bank {
    private int n;
    private long[] accounts;

    public Bank (long[] balance) {
        this.n =balance.length;
        this.accounts = new long [n+1];
        for (int i = 0; i < n; i++){
            accounts[i+1] = balance[i];
        }
    }
    private boolean accIsValid(int account){
        return account >=1 && account <= n;
    }
    public boolean transfer (int account1, int account2, long money){
        if (accIsValid(account1) && accIsValid(account2) && accounts[account1] >= money){
            accounts[account1] -= money;
            accounts[account2] += money;
            return true;
        }
        return false;
    }
    public boolean deposit(int account, long money){
        if (accIsValid(account) && money >= 0){
            accounts[account] += money;
            return true;
        }
        return false;
    }
    public boolean withdraw(int account, long money){
        if (accIsValid(account) && accounts[account] >= money){
            accounts[account] -= money;
            return true;
        }
        return false;
    }
}
