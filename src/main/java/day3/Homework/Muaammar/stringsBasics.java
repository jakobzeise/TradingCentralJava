import java.util.Scanner;
//String Basics:
//Prompt the user for a string and count the number of vowels in it.
//Check if a given string is a palindrome (reads the same backward as forward).
public class stringsBasics {
    public static void main(String[] args) {
        String input;
        String reverse="";
        char letter;
        int vowels =0;
        int i;

        System.out.println("Enter a string:");
        Scanner scanner= new Scanner(System.in);
        input = scanner.nextLine();
        input=input.toLowerCase();
        for(i=0;i<input.length();i++) {
            letter = input.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                vowels++;
        }
        System.out.println("number of vowels: " + vowels);

        System.out.println("check if the input string is a palindrome");

        for(i= input.length() -1;i>=0;i--) {
            reverse = reverse + input.charAt(i);}
        //System.out.printf("revese: "+ reverse);
        if (input.equals(reverse))
            System.out.println("the given input string is a palindrome");
        else
            System.out.println("No it is not a palindrome");



    }
}