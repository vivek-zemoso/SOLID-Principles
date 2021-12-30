package cleancode;

public abstract class Account extends Verify {
    private static int noOfAccounts = 1000;
    private int accountNumber;

    public Account() {
        this.accountNumber = noOfAccounts++;
    }

    // Transaction
    public abstract double deposit(double amount);

    public void display() {
        System.out.println(this.accountNumber);
    }
}
