interface BankingServices {

    public double deductInstantAlertCharges();

    public double deposit(double amount);

    public double withdraw(double amount);

}

class SavingsAccount implements BankingServices {
    private double balance;
    private double instantAlertCharges = 17.5;

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
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    @Override
    public double deductInstantAlertCharges() {
        this.balance -= this.instantAlertCharges;
        return this.balance;
    }
}

class CurrentAccount implements BankingServices {
    private double balance;

    public CurrentAccount() {
        this.balance = 5000;
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
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    @Override
    public double deductInstantAlertCharges() {
        throw new UnsupportedOperationException("Does not not have subscription for Instant Alerts !!");
    }
}

public class DoesNotFollowISP {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(15000);
        System.out.println(savingsAccount.deposit(10000));
        System.out.println(savingsAccount.withdraw(5545.65));
        System.out.println(savingsAccount.deductInstantAlertCharges());

        CurrentAccount currentAccount = new CurrentAccount(150000);
        System.out.println(currentAccount.deposit(123456.78));
        System.out.println(currentAccount.withdraw(32156.55));
        System.out.println(currentAccount.deductInstantAlertCharges());
    }
}
