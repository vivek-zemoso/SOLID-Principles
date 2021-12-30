package cleancode;

public class FixedDepositAccount extends Account {
    private double balance;

    public FixedDepositAccount() {
        this.balance = 150000;
    }

    @Override
    public double deposit(double balance) {
        this.balance += balance;
        return this.balance;
    }
}
