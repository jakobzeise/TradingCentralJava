package day1.homework;

import java.util.Scanner;

public class Andrei {

    public static void calculate(int number1, int number2) {
        System.out.println("Calculating...");

        int sum = number1 + number2;
        System.out.format("%d + %d = %d\n", number1, number2, sum);

        int diff = number1 - number2;
        System.out.format("%d - %d = %d\n", number1, number2, diff);

        float division = (float) number1 / number2;
        System.out.format("%d / %d = %f\n", number1, number2, division);

        int multiply = number1 * number2;
        System.out.format("%d * %d = %d\n", number1, number2, multiply);

        int power = (int) Math.pow(number1, number2);
        System.out.format("%d ^ %d = %d\n", number1, number2, power);

        if (number1 != 0) {
            int modulo = number1 % number2;
            System.out.format("%d %% %d = %d\n", number1, number2, modulo);
        } else
            System.out.println("Can not divide by 0");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert number 1: ");
        int number1 = scan.nextInt();

        System.out.print("Insert number 2: ");
        int number2 = scan.nextInt();

        calculate(number1, number2);

        scan.close();
    }
}
