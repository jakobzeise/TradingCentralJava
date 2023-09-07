package day5.part2.homework.alex;

public class BankAccount {

    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public  void deposit(int depositAmount) {
        balance = balance + depositAmount;
        System.out.println("Your new balance is: " + balance);
    }
    public  void withdraw(int withdrawAmount) {
        balance = balance - withdrawAmount;
        System.out.println("Your new balance is: " + balance);
    }




}
