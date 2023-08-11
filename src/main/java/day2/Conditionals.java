package day2;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        double number1 = 5;
        double number2 = 45;

        // String + number = String
        double result = number1 + number2;
        System.out.println(number1 + number2 + " is he result");

        int i1 = 5;
        int i2 = 0;

        // = ==
        // = assign a value

        // x = 5

        // 5 == 5


        if (i2 == 0) {
            System.out.println("You cannot divide by zero");
        }

        //if (boolean value) { what happens if true }


        // CTRL + ALT + L

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        boolean isOldEnough = age >= 18; // true

        System.out.println("What grade do you have?");
        int grade = scanner.nextInt(); // 1 - 6


        // if you only want one statement to be executed when
        // a condition is true you don't need curly brackets
        if (grade == 1) {
            System.out.println("Very good");
            System.out.println("test");
        }


        if (grade == 2) {
            System.out.println("Good");
            System.out.println("test2");
        }
        if (grade == 3) {
            System.out.println("Ok");
        }
        if (grade == 4) {
            System.out.println("enough");
        }
        if (grade == 5) {
            System.out.println("Not so good");
        }
        if (grade == 6) {
            System.out.println("Bad");
        }


        // when -> kotlin
        switch (grade) {
            case 1 -> {
                System.out.println("Very Good");
                System.out.println("You have learned enough");
            }
            case 2 -> System.out.println("Very Good1");
            case 3 -> System.out.println("Very Good2");
            case 4 -> System.out.println("Very Good3");
            case 5 -> System.out.println("Very Good4");
            case 6 -> System.out.println("Very Good5");
            default -> System.out.println("This is not a correct Grade");
        }
        // java 13

    }


}
