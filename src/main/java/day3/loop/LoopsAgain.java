package day3.loop;

public class LoopsAgain {

    public static void main(String[] args) {


        // 1. creating the counter
        // 2. condition
        // 3. the change of the counter
        int counter = 100;
        while (counter > 0) {
            System.out.println(counter--);
        }

        // For loops
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        int counter1 = 0;
        while (counter1 < 100) {
            System.out.println(counter1++);
        }



    }
}
