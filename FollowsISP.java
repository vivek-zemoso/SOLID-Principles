interface TransactionServices {

    public double deposit(double amount);

    public double withdraw(double amount);
}

interface SubscriptionServices {

    public double deductInstantAlertCharges();
}

class SavingsAccount implements TransactionServices, SubscriptionServices {
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

class CurrentAccount implements TransactionServices {
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
}

public class FollowsISP {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(15000);
        System.out.println(savingsAccount.deposit(10000));
        System.out.println(savingsAccount.withdraw(5545.65));
        System.out.println(savingsAccount.deductInstantAlertCharges());

        CurrentAccount currentAccount = new CurrentAccount(150000);
        System.out.println(currentAccount.deposit(123456.78));
        System.out.println(currentAccount.withdraw(32156.55));
    }
}
