package badcode;

public class CurrentAccount extends Account {

    private double balance;

    public CurrentAccount() {
        this.balance = 25000;
    }

    public CurrentAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    protected double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    @Override
    protected double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }
}
