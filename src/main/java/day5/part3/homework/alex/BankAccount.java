package day5.part3.homework.alex;

public class BankAccount {

    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Your new balance is: " + balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("You don't have enough funds");
        } else {
            balance = balance - amount;
            System.out.println("Your new balance is: " + balance);
        }
    }


}
