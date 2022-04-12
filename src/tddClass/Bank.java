package tddClass;

public class Bank {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0)
        balance = balance+amount;
    }

    public int getBalance() {
        return balance ;
    }

    public void withdraw(int amount) {
        if (amount < 0){balance = 0;}
        else  if (amount > balance){amount = 0;}
       else balance = balance - amount;

    }
}
