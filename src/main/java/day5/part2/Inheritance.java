package day5.part2;

public class Inheritance {
    public static void main(String[] args) {
        Class2 obj2 = new Class2("Test", 10);

        obj2.printAge();
        obj2.printName();
    }
}
class Class1 {
    String name;
    public void printName() {
        System.out.println(name);
    }
}

// inherits from
class Class2 extends Class1 {
    int age;
    public void printAge() {
        System.out.println(age);
    }

    Class2 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printName() {
        System.out.println("The name is " + name);
    }

}
