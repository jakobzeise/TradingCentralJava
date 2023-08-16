package day2.homework;

import java.util.Random;
import java.util.Scanner;

public class Ioana {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        //to check it works correctly
        System.out.println("to check if ==" + randomNumber);
        System.out.println("We are going to play a game... Guess My Number");
        System.out.println("The number is between 0 to 1000 ");

        Scanner addnumber = new Scanner(System.in);
        System.out.println("Please add what number i'm thinking of");
        int number = addnumber.nextInt();

        System.out.println("The number you chose is " + number);

        do {
            // && used for and, || used for or
            if (number < 0 || number > 1000) {
                System.out.println("The number you guessed id not in the interval provided it should be between 1 and 1000");
                System.out.println("Please guess another number");
                int number2 = addnumber.nextInt();
                number = number2;
                System.out.println("The number you chose is " + number);
            }/* else if (number != (int)number) {
                System.out.println("The number you chose is not a number but a string/character");
                System.out.println("Please guess another number");
                int number2 =  addnumber.nextInt();
                number = number2;
                System.out.println("The number you chose is "+ number);
            } */
            if (number == (randomNumber - 1) || number == (randomNumber + 1)) {
                System.out.println("You are one step away from finding the answer");
                System.out.println("Please guess another number");
                int number2 = addnumber.nextInt();
                number = number2;
                System.out.println("The number you chose is " + number);
            }
            if (number < (randomNumber)) {
                System.out.println("The number you guest is smaller");
                System.out.println("Please guess another number");
                int number2 = addnumber.nextInt();
                number = number2;
                System.out.println("The number you chose is " + number);
            }
            if (number > (randomNumber)) {
                System.out.println("The number you guest is bigger");
                System.out.println("Please guess another number");
                int number2 = addnumber.nextInt();
                number = number2;
                System.out.println("The number you chose is " + number);
            }
            if (number == randomNumber) {
                System.out.println("You guessed correctly the number is " + number);
            }

        } while (number != randomNumber);
    }


}
