package day2;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean hasAccess = true;

        // while loop
        while (hasAccess) {

            String password = "abc";
            System.out.println("What is the password?");
            String input = scanner.nextLine();

            if (password.equals(input)) {
                System.out.println("The password was correct you still have access");
            } else {
                System.out.println("The password was incorrect you lost the access");
                hasAccess = false;
            }
        }

        int number = 0;
        do {
            number = scanner.nextInt();
        } while (number != 0);

        //will never get executed
        int number1 = 0;
        while (number1 != 0) {
            number1 = scanner.nextInt();
        }

        // do while is at least executed once




    }

}
