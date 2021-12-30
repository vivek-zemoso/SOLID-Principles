package badcode;

public class FixedDepositAccount extends Account {
    private double balance;

    public FixedDepositAccount() {
        this.balance = 150000;
    }

    @Override
    protected double deposit(double balance) {
        this.balance += balance;
        return this.balance;
    }

    @Override
    protected double withdraw(double amount) {
        throw new UnsupportedOperationException("Can't withdraw from Fixed Deposit Account");
    }

}
