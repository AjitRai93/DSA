package OOPS.AbstractClasses;

public class Client {
    public static void main(String[] args) {
        //As animal class is abstract so we cannot create its object
//        Animal animal = new Animal();
        Animal animal = new Dog();
        animal.makeSound();
        animal.walk();

    }
}
