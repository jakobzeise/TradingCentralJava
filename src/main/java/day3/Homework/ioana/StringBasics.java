package day3.homework.ioana;

import java.util.Scanner;

public class StringBasics {

    /*
        String Basics:
        Prompt the user for a string and count the number of vowels in it.
        Check if a given string is a palindrome (reads the same backward as forward).

        Difficulty 5
        Time in Minutes 30
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        StringBuilder reverseString = new StringBuilder();
        System.out.println("Please add a string or characters");
        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.println("the string is " + userInput.charAt(i));
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                j++;
            }
        }
        System.out.println("the number of vowels for the given string is " + j);
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reverseString.append(userInput.charAt(i));
        }
        if (userInput.contentEquals(reverseString)) {
            System.out.println("your word is a palindrome");
        } else {
            System.out.println("your word is not a palindrome");
        }

    }

}
