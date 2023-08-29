package day4.homework.ioana;

public class Solution {

    public static void main(String[] args) {


        System.out.println("the result is " + multiply(23, 23));

        oddOrEven(5);

        countVowels("qwhgkffkjgfdgfdjgdfgde");

        // removeVowels("this is a test");

        // sumMultipliers(10);

        double solution = multiply(2, 4);

        String test = oddOrEven(4);


        String word = "HELLO";
        int result = countVowels1(word);
        if (result == 2) {
            System.out.println("The test was passed");
        }

        System.out.println("countVowels1(\"Hallo\") = " + countVowels1("Hallo"));


        System.out.println("countVowels1(\"Halasdflo\") = " + countVowels1("Halasdflo"));
        System.out.println("countVowels1(\"Hasadfllo\") = " + countVowels1("Hasadfllo"));
        System.out.println("countVowels1(\"Haasdfllo\") = " + countVowels1("Haasdfllo"));
        System.out.println("countVowels1(\"Hasdfallo\") = " + countVowels1("Hasdfallo"));
        System.out.println("countVowels1(\"Haasdfllo\") = " + countVowels1("Haasdfllo"));

    }

    // Create a multiply function
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

// CTRL + ALT + L -> Reformat Code
// CTRL * ALT * O -> Optimise Imports


    // Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
    // you need to return String
    public static String oddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }

    // Return the number (count) of vowels in the given string.
    public static void countVowels(String userInput) {
        int j = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                j++;
            }
        }
        System.out.println("the number of vowels for the given string is " + j);

    }

    public static int countVowels1(String userInput) {


        userInput = userInput.toLowerCase();
        int vowelCounter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                vowelCounter++;
            }

            // charAt || contains || toUpperCase
        }
        return vowelCounter;
    }



    /*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0 (for languages that do have them).
Note: If the number is a multiple of both 3 and 5, only count it once.
     */

   /* public static void sumMultipliers (int number){
        int i = number;
        if (i % 3 == 0 && i % 5 != 0) {
            int [] wordSplit=new int[] {i};
            i--;
        }
        if (i % 5 == 0 && i % 3 != 0) {
            int [] wordSplit=new int[] {i};
            i--;
        }
        if (i % 5 == 0 && i % 3 == 0) {
            int [] wordSplit=new int[] {i};
            i--;
        }
        System.out.println(Arrays.toString(int[] wordSplit));

    }

  */

    //For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
    // This one is not working and i don't know why
    public static String removeVowels(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u' || userInput.charAt(i) == 'A' || userInput.charAt(i) == 'E' || userInput.charAt(i) == 'I' || userInput.charAt(i) == 'O' || userInput.charAt(i) == 'U') {

                String vowelCharacterAsString = String.valueOf(userInput.charAt(i));

                userInput = userInput.replace(vowelCharacterAsString, "");

            }
        }
        return userInput;



        // Hello -> userInput
        // Hello -> userInput
    }

}
