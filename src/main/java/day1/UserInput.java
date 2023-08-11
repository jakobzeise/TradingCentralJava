package day1;

import java.util.Scanner;

public class UserInput {

    //classes are always PascalCase

    //variables are always camelCase

    public static void main(String[] args) {
        System.out.println("Hello :)");

        // create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("How old are you?");

        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.println("Type in the first number");
        double firstNumber = input.nextDouble();

        //do a calculator
        // tabnine and github copilot

        System.out.println("day1.UserInput.main");







    }
}
