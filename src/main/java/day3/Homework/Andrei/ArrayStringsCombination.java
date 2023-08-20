package day3.homework.andrei;

import java.util.Scanner;

public class ArrayStringsCombination {

    private static void display(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        display(words);

        scanner.close();
    }
}
