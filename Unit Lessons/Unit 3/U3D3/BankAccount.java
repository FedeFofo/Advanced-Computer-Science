import java.lang.IllegalArgumentException;

public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 100;
    }

    // withdrew too much
    // withdrew negative
    // withdrew no number

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("You are attempting to withdraw too much money!");
        } else if (amount < 0) {
            throw new IllegalArgumentException("The amount you're attempting to withdraw is negative.");
        }
        balance -= amount;
    }
}