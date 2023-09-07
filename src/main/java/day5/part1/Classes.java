package day5.part1;

import java.util.Random;
import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {

        //primitive data types
        int variable = 4;
        float f = 4f;

        // complex data types / reference types
        String s = new String("test");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("alex", 123234); // instance / object
        Person person2 = new Person("ioana", 13424);
        Person person3 = new Person("muaammar", 12324);

        // numbers, names, profile pictures

        int[] number = {123234, 13424, 12324};
        String[] names = {"alex", "ioana", "muaammar"};
        String[] pictures = {"https:...", "https:...", "https:..."};

        person1.picture = "https:.1..";
        person2.picture = "https:.2..";
        person3.picture = "https:.3..";


        Person[] people = {person1, person2, person3};

        System.out.println(people[0].name);

        //class -> blueprint

        person2.eat();

        String string = new String("asf");

        // static keyword

        Math.sqrt(16); // 4


        // use static if the method should the same every time


        person1.talk();

        new Person();
    }
}
