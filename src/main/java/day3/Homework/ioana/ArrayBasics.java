package day3.homework.ioana;

import java.util.Scanner;

public class ArrayBasics {

    /*
        Array Basics:
        Create an array of ten integers and print them in reverse order.
        Find the average of all the numbers in an array.

        Difficulty ->  2
        Time in Minutes -> 20 min
     */

    public static void main(String[] args) {

        Scanner getList = new Scanner(System.in);

        int goodNumber = 10;
        int[] array = new int[goodNumber];
        for (int i = 0; i < array.length; i++) {
            System.out.println("we will create list of ten numbers, you will chose them and at the end i'll display them in reverse");
            System.out.println("please add the number, this number will be on the position " + i + " in the list");
            array[i] = getList.nextInt();
        }
        System.out.println("the numbers found in the array in reverse order are: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
