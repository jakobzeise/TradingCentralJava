package day5.part2;

public class ToStringMethod {
    public static void main(String[] args) {

        Animal dog = new Animal("Doggo");


        System.out.println(dog.toString());

    }
}
class Animal {
    public Animal(String name) {
        this.name = name;
    }
    private String name;

}
