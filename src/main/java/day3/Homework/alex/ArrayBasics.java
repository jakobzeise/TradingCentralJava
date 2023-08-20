package day3.homework.alex;

public class ArrayBasics {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 9;
        double arraySum = 0;

        System.out.println();

        do {
            System.out.println(array[i]);
            arraySum = arraySum + array[i];
            i--;
        } while (i > -1);

        double arrayAverage = arraySum / array.length;
        System.out.println("\nThe average of all the numbers in the array is: " + arrayAverage);


    }
}
