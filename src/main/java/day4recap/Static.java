package day4recap;

import java.util.Random;
import java.util.Scanner;

public class Static {

    public static void main(String[] args) {

        hello();

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        Random random = new Random();
        random.nextBoolean();

        String string = new String("Hello");
        string.charAt(4);

        Static myObject = new Static();
        myObject.test();

        // methods that belong to a class
        // methods that belong to an object

        Static.hello();

        // OOP
    }

    void test() {
        System.out.println("Static.test");
        System.out.println("This is the non static test method");
    }

    static void hello() {

        System.out.println("Static.hello");
        System.out.println("This is the static hello method");

    }

    private static long test1(String test) {

        return 0L;
    }

}
