package cleancode;

public class SavingsAccount extends WithdrawableAccount {
    private double balance;

    public SavingsAccount() {
        this.balance = 5000;
    }

    public SavingsAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    @Override
    protected double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }
}
