package day5.part2.homework.andrei;
public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount b1 = new BankAccount();
        System.out.println("Balance: " + b1.getBalance());

        b1.deposit(500);
        System.out.println("Balance: " + b1.getBalance());

        b1.withdraw(500);
        System.out.println("Balance: " + b1.getBalance());

        b1.withdraw(500);
        System.out.println("Balance: " + b1.getBalance());
    }


}
