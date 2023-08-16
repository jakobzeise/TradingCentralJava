package day2.homework;

import java.util.Random;
import java.util.Scanner;

public class Muaammar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempts;
        int rannumber;
        int input, min = 1, max = 1000;
        char choice;
        System.out.println("Wanna play a game of luck ?");
        do {
            attempts = 0;
            rannumber = random.nextInt(min, max);


            do {
                System.out.println("Enter a number between " + min + " and " + max + " :");
                input = scanner.nextInt();
                if (input < min || input > max) {
                    System.out.println("out of range. we will not count that as play");
                    attempts--;
                } else {
                    if (input < rannumber)
                        // giving a hint
                        System.out.println("The number you entered is lower");
                    else if (input > rannumber) {
                        System.out.println("The number you entered is higher");
                    } else {
                        System.out.println("Great!, you got it right this time");

                    }

                }
                attempts++;
            }

            while (input != rannumber);
            System.out.println("It took you " + attempts + " attempts to get it right");
            if (attempts == 1)
                System.out.println("You are the luckiest person ever !");
            else if (attempts == max)
                System.out.println("It seems it is not your luck day !");
                // provide some encourgement if they get within 1% of total attempts
            else if (attempts <= (0.01 * max))
                System.out.println("Not bad it took you only " + ((double) attempts * 100 / max) + " % of trials");
            else System.out.println("I believe you can do better next time !");

            System.out.print("Wanna play again (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice != 'n' && choice != 'N');
        System.out.println("Thanks for playing. ");
        System.out.println("Exiting game !");

    }
}
