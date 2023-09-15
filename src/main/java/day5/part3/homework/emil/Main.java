package day5.part3.homework.emil;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1, 1000.0, 2.5);

        System.out.println(savingsAccount.getBalance());
        savingsAccount.calculateMonthlyInterest();
        System.out.println(savingsAccount.getBalance());

    }
}
