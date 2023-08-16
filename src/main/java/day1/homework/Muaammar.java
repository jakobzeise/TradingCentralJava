package day1.homework;

import java.util.Scanner;

public class Muaammar {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        char operator, choice;
        double result;

        while (true) {
            System.out.print("Enter first number: ");
            number1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            number2 = scanner.nextDouble();

            switch (operator) {
                case '+' -> result = number1 + number2;
                case '-' -> result = number1 - number2;
                case '*' -> result = number1 * number2;
                case '/' -> {
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.out.println("Invalid division by zero");
                        continue;
                    }
                }
                case '%' -> result = number1 % number2;
                case '^' -> result = Math.pow(number1, number2);
                default -> {
                    System.out.println("Invalid operator.");
                    continue;
                }
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform more operation y/n): ");
            choice = scanner.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                System.out.println("Existing calculator !");
                break;
            }
        }

        scanner.close();

    }
}
