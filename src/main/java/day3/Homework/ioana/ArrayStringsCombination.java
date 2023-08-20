package day3.homework.ioana;

import java.util.Scanner;

public class ArrayStringsCombination {

    /*
        Array and String Combination:
        Given a sentence (as a string), break it down into individual words and store them in an array.
        Then print each word on a new line.

        Difficulty 1 - 10  -  2
        Time in Minutes -  20 min

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add an example sentence");
        String userInputString = scanner.nextLine();
        String wordSplit[] = userInputString.split(" ");
        for (String word : wordSplit) {
            System.out.println("Here is a split per word in correct order");
            System.out.println(word);
        }
    }
}
