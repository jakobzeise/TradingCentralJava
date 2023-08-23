package day4recap;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        int[] array = {-12,-35,-24,-545,-3,-34,-34};

        final int test = 5; // constant variable



        int biggestNumberFromArray = getBiggestNumberFromArray(array);
        double result = Math.pow(biggestNumberFromArray, 5);

        System.out.println(result);

        ArrayList<String> list = new ArrayList<>();
        boolean wasSuccessful = list.add("First value");


    }

    static int getBiggestNumberFromArray(int[] array) {

        //-2,147,483,648
        int currentBiggestNumber = Integer.MIN_VALUE;

        for (int i: array) {
            if (i > currentBiggestNumber) {
                currentBiggestNumber = i;
            }
        }

        return currentBiggestNumber;

    }


}
