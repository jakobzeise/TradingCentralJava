package day3.Homework.Andrei.String_basics;
import java.util.Scanner;
public class Solution {

    private static int numberOfVowels(String word){

        int count = 0;

        for(int i = 0; i < word.length(); i++){
           char character =  word.charAt(i);

           switch(character){
               case 'A':
               case 'a':
               case 'E':
               case 'e':
               case 'I':
               case 'i':
               case 'O':
               case 'o':
               case 'U':
               case 'u':
                   count++;
                   break;
           }
        }
        return count;
    }

    private static boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString().equals(word);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a word: ");
        String word = scanner.next();

        System.out.println("Number of vowels: " + numberOfVowels(word));
        System.out.format("Is %s a palindrome? %b", word, isPalindrome(word));

        scanner.close();
    }
}
