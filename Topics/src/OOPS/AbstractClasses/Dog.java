package OOPS.AbstractClasses;

public class Dog extends Animal{
    @Override
    void walk() {
        System.out.println("Dog runs");
    }

    @Override
    void makeSound() {
        System.out.println("Bark bark");
    }
}
