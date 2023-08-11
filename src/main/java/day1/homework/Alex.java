package day1.homework;

import java.util.Scanner;

public class Alex {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Logic to prompt addition
        System.out.println("Let's start with an addition. Give me your first number.");
        int num1 = input.nextInt();
        System.out.println("Now give me the second.");
        int num2 = input.nextInt();
        int resultAddition = num1 + num2;
        System.out.println("The result of your addition is: " + resultAddition);

        //Logic to prompt subtraction
        System.out.println("Next let's do a subtraction. Give me your first number.");
        int num3 = input.nextInt();
        System.out.println("Now give me the second.");
        int num4 = input.nextInt();
        int resultSubtraction = num3 - num4;
        System.out.println("The result of your subtraction is: " + resultSubtraction);

        //Logic to prompt multiplication
        System.out.println("Next let's do a multiplication. Give me your first number.");
        int num5 = input.nextInt();
        System.out.println("Now give me the second.");
        int num6 = input.nextInt();
        int resultMultiplication = num5 * num6;
        System.out.println("The result of your multiplication is: " + resultMultiplication);

        //Logic to prompt division
        System.out.println("Finally, let's do a division. Give me your first number.");
        int num7 = input.nextInt();
        System.out.println("Now give me the second.");
        int num8 = input.nextInt();
        int resultDivision = num7 / num8;
        System.out.println("The result of your division is: " + resultDivision);


    }
}
