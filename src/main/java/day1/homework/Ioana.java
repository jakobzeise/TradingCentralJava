package day1.homework;

import java.util.Scanner;

public class Ioana {

    public static void main(String[] args) {
        System.out.println("Hello, we will do an Addition");

        Scanner addition = new Scanner(System.in);
        System.out.println("Please add the first number = ");
        int number1 =  addition.nextInt();
        System.out.println("Please add the second number = ");
        int number2 =  addition.nextInt();
        int result1 = number1+number2;
        //why is this one not working
        //System.out.println("The result is "+ number1 + number2);
        //what is displays The result is 2334
        System.out.println("The result is " + (number1 + number2));
        System.out.println("The result is "+ result1);

        System.out.println("Great!");
        System.out.println("Now we will do a Subtraction");
        System.out.println("Please add the first number = ");
        int number3 =  addition.nextInt();
        System.out.println("Please add the second number = ");
        int number4 =  addition.nextInt();
        int result2 = number3 - number4;
        System.out.println("The result is "+ result2);

        System.out.println("Great!");
        System.out.println("Now we will do a Multiplication");
        System.out.println("Please add the first number = ");
        int number5 =  addition.nextInt();
        System.out.println("Please add the second number = ");
        int number6 =  addition.nextInt();
        int result3 = number5 * number6;
        System.out.println("The result is "+ result3);

        System.out.println("Great!");
        System.out.println("Now we will do a Division");
        System.out.println("Please add the first number = ");
        int number7 =  addition.nextInt();
        System.out.println("Please add the second number = ");
        int number8 =  addition.nextInt();
        int result4 = number7 / number8;
        System.out.println("The result is "+ result4);
        System.out.println("Below are other mathematical computations");
        int result5 = number7 % number8;
        System.out.println("The result for a%b is "+ result5);
        float result6 = number7 / number8;
        System.out.println("The float result for a/b is "+ result6);

    }

}
