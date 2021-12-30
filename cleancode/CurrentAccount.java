package cleancode;

public class CurrentAccount extends WithdrawableAccount implements Promotions {

    private double balance;

    public CurrentAccount() {
        this.balance = 25000;
    }

    public CurrentAccount(double initialDeposit) {
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

    @Override
    public void sendPromotions(String promotionMessage) {
        System.out.println("I will send promotional messages !");
    }
}
