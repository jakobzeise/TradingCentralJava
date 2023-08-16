package day3.array;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        //             0 1 2
        int[] array = {2,3,4};
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            array[i] = 100;
        }

        System.out.println(Arrays.toString(array));





    }
}
