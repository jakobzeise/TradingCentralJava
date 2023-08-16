package day2.homework;

import java.util.Random;
import java.util.Scanner;

public class Emil {

    public static void main(String[] args) {
        //Creating the number generator;
        Random RNG = new Random();

        //Use Scanner class for user input
        Scanner keyboard_input = new Scanner(System.in);

        //RNG to pick number between 1-1000
        int randomNumber = RNG.nextInt(1, 1000);
        //Show the generated number. I know, it's a bit silly, but I don't like blind input code :)
        System.out.println("The random number is: " + randomNumber);
        int guess = -1;

        //Endless loop
        while (guess != randomNumber) {
            //Ask user for next guess input
            System.out.println("Input your guess: ");

            //Read keys input:
            guess = keyboard_input.nextInt();

            //Check if the guess is high, low or correct
            if (guess < randomNumber) {
                System.out.println("Too Low! Retry: ");
            } else if (guess > randomNumber) {
                System.out.println("Too High! Retry: ");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
            }
        }


    }
}
