package day3.homework.andrei;

import java.util.Scanner;

public class StringsBasics {

    private static int numberOfVowels(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            switch (character) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' ->
                        count++;
            }
        }
        return count;
    }

    private static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString().equals(word);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a word: ");
        String word = scanner.next();

        System.out.println("Number of vowels: " + numberOfVowels(word));
        System.out.format("Is %s a palindrome? %b", word, isPalindrome(word));

        scanner.close();
    }
}
