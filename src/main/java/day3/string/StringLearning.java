package day3.string;

import java.util.Random;
import java.util.Scanner;

public class StringLearning {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);

        // String is a reference type

        // new keyword -> creating reference type objects
        System.out.println("What is the password?");
        String password = scanner.nextLine();


        // "" -> empty and blank
        // "   " -> only blank not empty


        if (password.equalsIgnoreCase("test123")) {
            System.out.println("The password is correct");
        } else {
            System.out.println("The password is incorrect");
        }

        String test = "animal";

        if (test.endsWith("a")) {
            System.out.println("The input ends with a");
        } else {
            System.out.println("The input does not end with a");
        }









    }
}
