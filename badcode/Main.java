package badcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();

        System.out.println("Add Balance in Savings Account");
        double addSavings = s.nextDouble();

        System.out.println("Add Balance in Current Account");
        double addCurrent = s.nextDouble();

        System.out.println("Add Balance in Fixed Deposit Account");
        double addFixedDeposit = s.nextDouble();

        System.out.println("Savings Account  - " + savingsAccount.deposit(addSavings));
        System.out.println("Current Account  - " + currentAccount.deposit(addCurrent));
        System.out.println("Fixed Deposit Account  - " + fixedDepositAccount.deposit(addFixedDeposit));

        System.out.println("Withdraw Balance from Savings Account");
        double withdrawSavings = s.nextDouble();

        System.out.println("Withdraw Balance from Current Account");
        double withdrawCurrent = s.nextDouble();

        System.out.println("Withdraw Balance from Fixed Deposit Account");
        double withdrawFixedDeposit = s.nextDouble();

        System.out.println("Savings Account  - " + savingsAccount.withdraw(withdrawSavings));
        System.out.println("Current Account  - " + currentAccount.withdraw(withdrawCurrent));
        System.out.println("Fixed Deposit Account  - " + fixedDepositAccount.withdraw(withdrawFixedDeposit));

        s.close();
    }
}