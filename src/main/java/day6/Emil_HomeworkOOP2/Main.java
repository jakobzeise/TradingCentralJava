public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(666, 1000.0d);

        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500.0d);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(1000.0d);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(1500.0); // This will display an error message
    }
}
