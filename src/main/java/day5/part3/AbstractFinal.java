package day5.part3;

public class AbstractFinal {

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
    }

}

abstract class Person {
    String name;

    abstract public void printJob();
}

final class Engineer extends Person {
    double salary;

    @Override
    public void printJob() {
        System.out.println("I am an engineer");
    }
}

