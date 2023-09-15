package day5.part3.homework.ioana;

import java.util.Scanner;

class SavingsAccount extends BankAccount {

    //  Add a new attribute to the SavingsAccount class called interestRate (double) to represent the annual interest rate specific to savings accounts.

    private double interestRate;

    // Create a constructor for the SavingsAccount class that accepts an account number, an initial balance, and an interest rate as parameters. Use the constructor of the superclass BankAccount to initialize the account number and balance.
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;

    }


    // Override the withdraw method in the SavingsAccount class to include a penalty for withdrawing funds if the balance falls below a certain threshold. For example, if the balance falls below $100, a $10 penalty should be deducted from the balance in addition to the requested withdrawal amount.
    @Override
    public double withdraw(double amount) {
        Scanner removeAmount = new Scanner(System.in);
        System.out.println("Please add the amount that you want to withdraw from the account");
        double withdrawAmountToBalance = removeAmount.nextInt();

        if (withdrawAmountToBalance > getBalance()) {
            System.out.println("Action can not be done as there are not enough funds in the account");

        } else if (getBalance() - withdrawAmountToBalance <= 100) {
            setBalance(getBalance() - withdrawAmountToBalance - 10);
            System.out.println("please be informed that you will pay a 10$ penalty");
            System.out.println("for account " + getAccountNumber() + " the new balance is " + getBalance());

        } else if (getBalance() - withdrawAmountToBalance > 100) {
            setBalance(getBalance() - withdrawAmountToBalance);
            System.out.println("for account " + getAccountNumber() + " the new balance is " + getBalance());

        }
        return getBalance();


    }


    // Implement a method called calculateMonthlyInterest in the SavingsAccount class that calculates and adds monthly interest to the account balance. The formula to calculate monthly interest is: monthlyInterest = (balance * interestRate) / 12. This method should be automatically called at the end of each month.


    {
        double monthlyInterest;
        monthlyInterest = (getBalance() * interestRate * 100) / 12;

    }

    // In the main method, create instances of both BankAccount and SavingsAccount, and demonstrate how deposit, withdrawal, interest calculation, and penalties work for each type of account.


}
