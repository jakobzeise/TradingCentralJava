package day3.homework.muaammar;//Array and String Combination:
//Given a sentence (as a string), break it down into individual words and store them in an array. Then print each word on a new line.

import java.util.Scanner;

public class ArrayStringsCombination {


    public static void main(String[] args) {
        String input;
        String[] arrayOfWords;
        int i;

        System.out.println("Enter a string:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        arrayOfWords = input.split(" ");
        System.out.println("Words printed by line: ");
        for (i = 0; i < arrayOfWords.length; i++)
            System.out.println(arrayOfWords[i]);


    }
}