package badcode;

import java.security.InvalidParameterException;

public abstract class Account implements Verification {
    private static int noOfAccounts = 1000;
    private int accountNumber;
    private double balance;

    public Account() {
        this.accountNumber = noOfAccounts++;
        this.balance = 5000;
    }

    // Transaction
    protected abstract double deposit(double amount);

    protected abstract double withdraw(double amount);

    // Verification
    @Override
    public String sendMessage(String messageMode) {
        switch (messageMode) {
            case "otp": {
                return "otp message";
            }

            case "email": {
                return "email message";
            }

            default: {
                throw new InvalidParameterException("Invalid message mode");
            }
        }
    }

    @Override
    public void sendPromotions(String promotionMessage) {
        System.out.println("I wil send promotional messages");
    }

    public void display() {
        System.out.println(this.accountNumber);
        System.out.println(this.balance);
    }
}
