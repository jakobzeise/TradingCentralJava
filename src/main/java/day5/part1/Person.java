package day5.part1;



public class Person {

    // properties
    // methods / functionality
    // constructor

    // this always is the current object
    public Person(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // default constructor
    public Person() {
    }

    String name;
    int phoneNumber;
    String picture;

    public void talk () {
        System.out.println("Hello, my name is " + name);
    }

    public void eat() {
        System.out.println("I like food");
    }




}
