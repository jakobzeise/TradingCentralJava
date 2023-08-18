//Array and String Combination:
//Given a sentence (as a string), break it down into individual words and store them in an array. Then print each word on a new line.

import java.util.Scanner;

public class arrayStringsCombination {
    public static void main(String[] args) {
        String input;
        String[] arrayofwords ;
        int i;

        System.out.println("Enter a string:");
        Scanner scanner= new Scanner(System.in);
        input = scanner.nextLine();

        arrayofwords= input.split(" ");
        System.out.println("Words printed by line: ");
        for(i=0;i<arrayofwords.length;i++)
            System.out.println(arrayofwords[i]);


    }
}