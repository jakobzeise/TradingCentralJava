package day5.part3.homework.ioana;



public class BankSystem {

    public static void main(String[] args) {

        BankAccount customer1 =  new BankAccount(111, 300);
        BankAccount customer2 =  new BankAccount(222, 5679.45);
        BankAccount customer3 =  new BankAccount(333, 0);
        BankAccount customer4 =  new BankAccount(444, 457.89);
        BankAccount customer5 =  new BankAccount(555, 23);

        System.out.println("first i'll print the balance for the existing customers");

        customer1.getBalance();
        customer2.getBalance();
        customer3.getBalance();
        customer4.getBalance();
        customer5.getBalance();









    }
}
