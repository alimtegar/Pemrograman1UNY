// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0.0;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance -= (balance >= (amount + transactionFee)) ? (amount + transactionFee) : 0;
    }
}