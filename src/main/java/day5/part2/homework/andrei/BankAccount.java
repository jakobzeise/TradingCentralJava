package day5.part2.homework.andrei;
import java.util.Random;
public class BankAccount {
    private final int accountNumber;
    private double balance;

    public BankAccount(){
        Random random = new Random();
        accountNumber = random.nextInt(Integer.MAX_VALUE);
        balance = 0;
        System.out.println("Your account number is: " + accountNumber);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws Exception{
        if(amount <= balance){
            balance -= amount;
        } else {
            throw new NotEnoughBalanceException("Balance is insufficient");
        }
    }

    public double getBalance(){
        return balance;
    }
}
