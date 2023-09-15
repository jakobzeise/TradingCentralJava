package day5.part3.homework.ioana;

import java.util.Scanner;

public class Main {

    private int test;

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1, 1000);
        bankAccount.setBalance(-100_000);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the amount that you want to add to the account");

        double amount = scanner.nextDouble();




        bankAccount.deposit(amount);

    }
}
