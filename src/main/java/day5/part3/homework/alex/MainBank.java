package day5.part3.homework.alex;

public class MainBank {

    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount(1, 10);
        SavingsAccount bank3 = new SavingsAccount(3, 800, .5);


        bank1.deposit(400);
        bank1.withdraw(3);
        bank3.deposit(20);
        bank3.calculateMonthlyInterest();
        bank3.withdraw(720);
        bank3.withdraw(1);
        bank3.calculateMonthlyInterest();

    }
}
