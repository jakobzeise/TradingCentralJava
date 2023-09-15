package day5.part3.homework.andrei;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, int interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws Exception{
        super.withdraw(amount);

        if (balance < 100){
            balance -= 10;
            System.out.println("Penalty of 10$ applied");
        }
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest = (balance * interestRate / 100) / 12;
        balance += monthlyInterest;
    }
}
