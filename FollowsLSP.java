import java.util.Scanner;

abstract class Account {
    protected abstract void deposit(double amount);
}

abstract class WithdrawAbleAccount extends Account {
    protected abstract double withdraw(double amount);
}

abstract class NonWithdrawAbleAccount extends Account {
}

class BankingAppWithdrawalService {
    private WithdrawAbleAccount withdrawableAccount;

    public BankingAppWithdrawalService(WithdrawAbleAccount withdrawAbleAccount) {
        this.withdrawableAccount = withdrawAbleAccount;
    }

    protected double withdraw(double amount) {
        return withdrawableAccount.withdraw(amount);
    }
}

class SavingsAccount extends WithdrawAbleAccount {
    private double balance;

    public SavingsAccount() {
        this.balance = 5000;
    }

    public SavingsAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    protected void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    protected double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return this.balance;
    }
}

class CurrentAccount extends WithdrawAbleAccount {

    private double balance;

    public CurrentAccount() {
        this.balance = 25000;
    }

    public CurrentAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    protected void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    protected double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return this.balance;
    }
}

class FixedDepositAccount extends NonWithdrawAbleAccount {
    private double amount;

    public FixedDepositAccount(double amount) {
        this.amount = amount;
    }

    @Override
    protected void deposit(double amount) {
        this.amount += amount;
    }

    public double getBalance() {
        return this.amount;
    }
}

public class FollowsLSP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter savings Account Opening Balance");
        double savings = s.nextDouble();

        System.out.println("Enter current Account Opening Balance");
        double current = s.nextDouble();

        System.out.println("Enter Fixed Deposit Opening amount");
        double fixedDeposit = s.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(savings);
        CurrentAccount currentAccount = new CurrentAccount(current);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(fixedDeposit);

        System.out.println("Savings Account  - " + savingsAccount.getBalance());
        System.out.println("Current Account  - " + currentAccount.getBalance());
        System.out.println("Fixed Deposit Account  - " + fixedDepositAccount.getBalance());

        System.out.println("Add Balance in Savings Account");
        double addSavings = s.nextDouble();

        System.out.println("Add Balance in Current Account");
        double addCurrent = s.nextDouble();

        System.out.println("Add Balance in Fixed Deposit Account");
        double addFixedDeposit = s.nextDouble();

        savingsAccount.deposit(addSavings);
        currentAccount.deposit(addCurrent);
        fixedDepositAccount.deposit(addFixedDeposit);

        System.out.println("Savings Account  - " + savingsAccount.getBalance());
        System.out.println("Current Account  - " + currentAccount.getBalance());
        System.out.println("Fixed Deposit Account  - " + fixedDepositAccount.getBalance());

        System.out.println("Withdraw Balance from Savings Account");
        double withdrawSavings = s.nextDouble();

        System.out.println("Withdraw Balance from Current Account");
        double withdrawCurrent = s.nextDouble();

        System.out.println("Savings Account  - " + savingsAccount.withdraw(withdrawSavings));
        System.out.println("Current Account  - " + currentAccount.withdraw(withdrawCurrent));

        s.close();
    }
}
