package day3.array;

import java.util.Arrays;

public class ArraysLearning {

    public static void main(String[] args) {

        int[] numberArray = new int[10];

        System.out.println(Arrays.toString(numberArray));


        

        String[] englishWords = new String[10];
        englishWords[7] = "Test";

        System.out.println(Arrays.toString(englishWords));

        int[] array = {1, 23, 13, 5325};

        System.out.println(Arrays.toString(array));
        
        //for each number in the array
        for (int number : array) {
            System.out.println(number * 2);
        }


        for (int i = 0; i < array.length; i++) {
            array[i] = 500;
        }

        System.out.println(Arrays.toString(array));
        



    }
}
