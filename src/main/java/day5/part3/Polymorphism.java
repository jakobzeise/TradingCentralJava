package day5.part3;

import org.w3c.dom.ls.LSOutput;

public class Polymorphism {

    public static void main(String[] args) {

        // poly -> multi
        // morph -> form



        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();

        cat.makeSound();


    }


}

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}
class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("wau wau");
    }
}