package day3.homework.alex;

import java.util.Scanner;

public class StringBasics {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Send me a message and I will tell you some stuff about it ");

        String userString = input.nextLine();
        int vowelCount = 0;
        String reverseString = "";
        int length = userString.length();

        for (int i = length - 1; i >= 0; i--)
            reverseString = reverseString + userString.charAt(i);

        for (int i = 0; i < userString.length(); i++) {

            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' || userString.charAt(i) == 'A' || userString.charAt(i) == 'E' || userString.charAt(i) == 'I' || userString.charAt(i) == 'O' || userString.charAt(i) == 'U') {

                vowelCount++;
            }

        }

        if (userString.equals(reverseString)) {
            System.out.println("Your string is a palindrome");

        } else {
            System.out.println("Your string is not a palindrome");
        }
        System.out.println("The number of vowels in your message was: " + vowelCount);
    }


}
