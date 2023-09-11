package day5.homework.part2.muaammar;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, 2000);
        BankAccount account2 = new BankAccount(5454, 500);

        // test a valid deposit
        account1.deposit(200.50);
        // test an invalid deposit
        account1.deposit(0);
        account1.deposit(-10);
        // test account 2
        account2.withdraw(100);
        // test a withdraw with insufficient balance
        account2.withdraw(500);

    }

}