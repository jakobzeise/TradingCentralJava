package day4.methods;

public class FirstMethod {

    // Methods/Functions
    // a method is a function inside a class

    public static void main(String[] args) {

        test();

        System.out.println("This is the main method");

        test();

        int number1 = add(6, 4);
        int number2 = add(2,3);
        int number3 = add(2123,3123);
        int number4 = add(5422,3243);

    }
    // returnType

    // void -> nothing
    public static int add(int number1, int number2) {

        return 9;

    }

    static void test() {
        System.out.println("This is a test method");
        System.out.println("This is a test method");
        System.out.println("This is a test method");
        System.out.println("This is a test method");
        System.out.println("This is a test method");
    }

    // Invocation
    // Return Types
    // Arguments
    // Overloading
    // Access Modifier

    // naming convention -> camelCase
}
