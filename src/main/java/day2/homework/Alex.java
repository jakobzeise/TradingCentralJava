package day2.homework;

import java.util.Random;
import java.util.Scanner;

public class Alex {

    public static void main(String[] args) {

        //Creating the scanner for user inputs and the random logic
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Create the random number the user must try to guess
        int randomNumber = random.nextInt(1, 100);
        int userGuess = 0;

        //Message to explain that the user is being prompted for a number and that the program is ready for them
        System.out.println("Input a number between 1 and 100 to try and guess the randomly generated number: ");
        //Loop that takes user input and compares it to the randomNumber. Upon an incorrect guess will prompt the user again
        while (userGuess != randomNumber) {
            userGuess = input.nextInt();

            /*Will let the user know if they managed to guess the number or if they were incorrect and
            whether the guess was too big or small.
                        */
            if (userGuess == randomNumber) { //success
                System.out.println("Correct! You successfully guessed the random number: " + randomNumber);
            } else if (userGuess < 1 || userGuess > 1000) { //Out of range
                System.out.println("Try a number between 1 and 100: ");
            } else if (userGuess == randomNumber + 1) {//Lets the user know if they were 1 over the answer
                System.out.println("You are really close! But your guess was a bit too big. Try again:");
            } else if (userGuess == randomNumber - 1) {//Lets the user know if they were 1 under the answer
                System.out.println("You are really close! But your guess was a bit too small. Try again:");
            } else if (userGuess > randomNumber) {//Too large a guess
                System.out.println("Try a smaller number: ");
            } else if (userGuess < randomNumber) {//Too small a guess
                System.out.println("Try a larger number: ");
            }


        }


    }

}
