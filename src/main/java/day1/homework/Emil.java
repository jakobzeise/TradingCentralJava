package day1.homework;

import java.util.Scanner;

public class Emil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, result;
        char operator;

        System.out.print("Please enter the first number (A): ");
        A = scanner.nextInt();

        System.out.print("Please enter the second number (B): ");
        B = scanner.nextInt();

        System.out.print("Enter any of the following operators (+, -, *, /): ");
        operator = scanner.next().charAt(0); //first character being typed - 0 = first input

        //Java 13
        //using "switch" and "break" due to multiple possible if/else statements
        switch (operator) {
            case '+' -> {  //using addition
                result = A + B;
                System.out.println("Result: " + result);
            }
            case '-' -> {  //using subtraction
                result = A - B;
                System.out.println("Result: " + result);
            }
            case '*' -> {  //using multiplication
                result = A * B;
                System.out.println("Result: " + result);
            }
            case '/' -> {  //using division
                if (B == 0) {
                    System.out.println("Error: Can't divide by zero");
                } else {
                    double divisionResult = (double) A / B;
                    System.out.println("Result: " + divisionResult);
                }
            }
            default ->
                    System.out.println("Error: these are not the numbers you are looking for :D");
        }
    }

}
