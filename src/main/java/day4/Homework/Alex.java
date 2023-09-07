package day4.homework;

public class Alex {

    public class Multiply {
        public static Double multiply(Double a, Double b) {
            return a * b;
        }
    }


    public class EvenOrOdd {
        public static String even_or_odd(int number) {

            if (number % 2 == 0) {
                return "Even";

            } else {
                return "Odd";

            }


        }
    }

    public class Solution {

        public int solution(int number) {

            int sum = 0;
            for (int i = 0; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;

                }
            }
            return sum;
        }
    }

    public class Vowels {

        public static int getCount(String str) {
            int vowelCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowelCount++;
                }

            }

            return vowelCount;
        }

    }


    public class Troll {
        public static String disemvowel(String str) {

            str = str.replaceAll("(?i)[aeiou]", "");

            return str;
        }
    }


}
