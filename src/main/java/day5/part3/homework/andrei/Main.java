package day5.part3.homework.andrei;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount b1 = new BankAccount();
        System.out.println("Bank account: ");
        System.out.format("Balance: %.2f$\n", b1.getBalance());

        b1.deposit(123.45);
        System.out.format("Balance: %.2f$\n", b1.getBalance());

        b1.withdraw(123.45);
        System.out.format("Balance: %.2f$\n", b1.getBalance());

        try{
            b1.withdraw(500);
            System.out.format("Balance: %.2f$\n", b1.getBalance());
        } catch (NotEnoughBalanceException e){
            System.out.println("Balance is insufficient");
        }

        System.out.println("-----------------------------");

        System.out.println("Savings account: ");
        SavingsAccount s1 = new SavingsAccount(123, 0, 10);
        System.out.format("Balance: %.2f$\n", s1.getBalance());

        s1.deposit(149.5);
        System.out.format("Balance: %.2f$\n", s1.getBalance());

        s1.withdraw(50.5);
        System.out.format("Balance: %.2f$\n", s1.getBalance());

        for(int i = 0; i < 12; i++){
            s1.calculateMonthlyInterest ();
        }
        System.out.format("Balance: %.2f$\n", s1.getBalance());
    }
}
