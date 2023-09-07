package day5.part2.homework.alex;

public class MainBank {

    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount(1, 10);
        BankAccount bank2 = new BankAccount(2, 1);

        bank1.deposit(400);
        bank1.getBalance();
        bank1.getAccountNumber();
        bank1.withdraw(3);

    }
}
