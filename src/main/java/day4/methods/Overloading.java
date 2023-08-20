package day4.methods;

public class Overloading {
    // overloading is having the same name but different Arguments
    public static void main(String[] args) {


    }

    //Overloaded method -> it has different implementations
    static void add(int number1, int number2) {

        System.out.println("This method takes two arguments");

    }
    static void add(String number1) {

        System.out.println("This method takes one argument");

    }

}
