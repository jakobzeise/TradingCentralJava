package day3.loop;

public class ConditionalsAgain {

    public static void main(String[] args) {

        int min = 0;
        int max = 1000;
        int number = -50;

        // && -> and
        // || -> or

        // nested if statements
        // 1 - 100
        if (number > max || number < min) {
            System.out.println("The number is not valid");
        } else {
            System.out.println("The number is valid");
        }

        boolean b = 5 == 5 && 5 < 3;

        System.out.println(b);





    }
}
