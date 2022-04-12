package tddClass;

public class Account2 {
    private int balance;
    public void deposit(int amount) {
        if (amount > 0)
        balance = balance + amount;
    }
    public void withdraw(int amount) {
        if (amount > balance) {amount = 0;}
        if(amount > 0)
        balance = balance - amount;
    }

    public void transfer(String name, int amount) {
        balance = balance - amount;

    }
    public int getBalance() {
        return balance;
    }

}
