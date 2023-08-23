package day4.homework.Muaammar;

import java.util.Scanner;

public class Muaammar {

    public static void main(String[] args) {

        String input;
        int number ;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter 1 to 5 to select an operation:");
        int op = scanner.nextInt();
        switch(op)
        {
            case 1 -> {
                System.out.println("Multiplication Operation: ");
                System.out.println("Enter the first number: ");
                double a = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                double b = scanner.nextDouble();
                System.out.println("Multiplication result: " + multiply(a,b));
            }
            case 2 -> {
                System.out.println("check if input is even or odd number");
                System.out.println("Enter a number: ");
                number = scanner.nextInt();
                System.out.println("The number: "+ number +" is " + even_or_odd(number));
            }
            case 3 -> {
                System.out.println("get the sum of multiples of 3 or 5");
                System.out.println("\nEnter a number: ");
                number = scanner.nextInt();
                System.out.println("Sum of the multiples of 3 or 5 below " + number + " is: " + solution(number));
            }
            case 4 -> {
                System.out.println("get the number of vowels in a string");
                System.out.println("Enter a string of lower case letter and/or spaces: ");
                scanner.nextLine();
                input = scanner.nextLine();
                System.out.println("Number of vowels are: " + getCount(input));
            }
            case 5 -> {
                System.out.println("Remove vowels from Trolls");
                System.out.println("Enter a string as a Troll: ");
                scanner.nextLine();
                input = scanner.nextLine();
                System.out.println("All vowels removed: " +disemvowel(input));;
            }
            default -> System.out.println("Invalid operation. Please select a valid operation.");
        }


    }

    // Functions Section
    /*
    1. return multiplication of two numbers
     */
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
    /*2. Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
     */
    public static String even_or_odd(int number) {
        return (number%2==0)? "even": "odd";
    }

    /*
    3.If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
    Note: If the number is a multiple of both 3 and 5, only count it once.
    */
    public static int solution(int number) {
        int result = 0;
        if(number<=0)
            return 0;
        for (int i=1;i< number; i++) {
            if (i % 3 == 0 || i % 5 == 0)
            {result += i;}
        }
        return result;
    }

    /*
    4. Return the number (count) of vowels in the given string. We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.
     */
    public static int getCount(String str){

        char letter;
        int vowels =0;
        int i;
        for(i=0;i<str.length();i++) {
            letter = str.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                vowels++;
        }
        return vowels;
    }
    /*
    5. Trolls are attacking your comment section!
    A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
    Your task is to write a function that takes a string and return a new string with all vowels removed.
    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
    Note: for this kata y isn't considered a vowel.
     */
    public static String disemvowel(String str) {
        // I will use the replaceAll method to replace any vowel with space
        return str.replaceAll("[aAeEiIoOUu]","");
    }
}
