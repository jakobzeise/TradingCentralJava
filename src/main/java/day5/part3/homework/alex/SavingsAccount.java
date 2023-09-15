package day5.part3.homework.alex;

public class SavingsAccount extends BankAccount {

    private double interestRate;


    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(int withdrawAmount) {
        super.withdraw(withdrawAmount);
        if (getBalance() < 100) {
            System.out.println("Because your balance has fallen bellow $100," +
                    " the bank will take an additional $10.");
            setBalance(getBalance() - 10);
            System.out.println("Your balance after the penalty charge is: " + getBalance());
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (getBalance() * interestRate) / 12;
        System.out.println(monthlyInterest);
    }



}
