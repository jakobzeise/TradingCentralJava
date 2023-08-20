package day3.homework.andrei;

import java.util.Arrays;
import java.util.Random;

public class ArrayBasics {

    private static int[] createRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        return array;
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[count++] = array[i];
        }

        return reversedArray;
    }

    private static double average(int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }


    public static void main(String[] args) {
        int[] array = createRandomArray(10);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(array)));
        System.out.println("Average of all number is: " + average(array));
    }
}
