package day5.homework.part2.muaammar;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private double amount = 0.0;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your new balance is " + balance);
        } else {
            System.out.println("Invalid amount");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance > amount) {
                balance -= amount;
                System.out.println("Your new balance is " + getBalance());
            } else {
                System.out.println("You do not have a sufficient balance ");
                System.out.println("You can only draw up to: " + getBalance());
            }
        } else {
            System.out.println("Invalid amount");
        }


    }
}