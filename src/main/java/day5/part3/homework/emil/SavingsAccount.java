package day5.part3.homework.emil;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            super.withdraw(amount + 10);  // Deduct penalty
        } else {
            super.withdraw(amount);
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (getBalance() * ((interestRate / 12) / 100));
        deposit(monthlyInterest);
    }
}
