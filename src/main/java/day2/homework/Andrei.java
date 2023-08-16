package day2.homework;

import java.util.Random;
import java.util.Scanner;

public class Andrei {

    public static void guessGame() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10);
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = scan.nextInt();

            if (guess > number) {
                System.out.println("Your guess is bigger than the number");
            } else if (guess < number) {
                System.out.println("Your guess is smaller than the number");
            }

        } while (number != guess);

        System.out.println("You guessed the number!");
        scan.close();
    }

    public static void main(String[] args) {
        guessGame();
    }
}
