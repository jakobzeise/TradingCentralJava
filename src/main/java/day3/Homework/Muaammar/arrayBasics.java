package day3.homework.muaammar;//Array Basics:
//Create an array of ten integers and print them in reverse order.
//Find the average of all the numbers in an array.

public class ArrayBasics {

    public static void main(String[] args) {
        double sum = 0.0;
        double average;
        int[] array = {2, 5, 34, 3, 43, 2, 9, 12, 1, 4};
        System.out.println("array in revers order: ");
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + "  ");

        System.out.println("\naverage of all numbers in the array: ");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println(average);

    }
}