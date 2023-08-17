package day3.Homework.Andrei.arrayAndString;
import java.util.Scanner;
public class Solution {

    private static void display(String[] words){
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        display(words);

        scanner.close();
    }
}
