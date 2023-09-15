package day5.part3.homework.ioana;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;


    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("You can't go negative");
        }
    }

    // getBalance() - Return the current account balance.
    public double getBalance() {
        System.out.println("balance for account " + accountNumber + " is " + balance);
        return balance;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // deposit(double amount) - Add the specified amount to the account balance.

    public double deposit(double amount) {
        balance = balance + amount;
        System.out.println("for account " + accountNumber + " the new balance is " + balance);
        return balance;
    }

    // withdraw(double amount) - Subtract the specified amount from the account balance, but only if the balance is sufficient. Display an error message if there are insufficient funds.

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Action can not be done as there are not enough funds in the account");
        } else {
            balance = balance - amount;
            System.out.println("for account " + accountNumber + " the new balance is " + balance);
        }
        return balance;
    }




}
