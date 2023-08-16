package day3.string;

import java.util.Arrays;

public class StringLearning1 {

    public static void main(String[] args) {

        String test = "Hello, this is a test";
        test = test.replaceAll(",", "");

        System.out.println(test.toLowerCase());

        System.out.println(test.indexOf("l"));

        String[] array = test.split(" ");

        System.out.println(array.length);

        System.out.println(Arrays.toString(array));






        // length, charAt, toLowerCase, toUpperCase, equals, equalsIgnoreCase,
        // indexOf replaceAll, endsWith, startsWith

    }
}
