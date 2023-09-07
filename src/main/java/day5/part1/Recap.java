package day5.part1;

import java.util.Random;

public class Recap {

    public static void main(String[] args) {

        // String methods
        /*************************/

        String s = "Hello";

        boolean contains = s.contains("s");


        // 0 1 2 3 4
        char c = s.charAt(3);

        int i = s.indexOf(c); // -1

        if (s.indexOf('s') == -1) {

        }

        if (s.contains("s")) {

        }

        /*************************/


        // enhanced for loop / for each loop
        int [] array = {1,2,3,4,5};

        for (int number: array) {
            System.out.println(number);
        }

        for (int j = 0; j < args.length; j++) {
            System.out.println(array[j]);
        }

        // Converting Data types

        String string = "55";

        double d = Double.parseDouble(string);
        int integer = Integer.parseInt(string);
        float f = Float.parseFloat(string);
        short sho = Short.parseShort(string);
        long l = Long.parseLong(string);

        String value = String.valueOf(d);

        System.out.println("value = " + value);

        int randomNumber = 1203;

        String randomNumberAsAString = String.valueOf(randomNumber);

        Random random = new Random();

        StringBuilder sb = new StringBuilder("Hello");

        sb.reverse();
        sb.append("Test");

        String resultString = sb.toString();
        System.out.println("resultString = " + resultString);


    }
}
