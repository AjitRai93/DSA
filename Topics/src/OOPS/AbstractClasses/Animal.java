package OOPS.AbstractClasses;

public abstract class Animal {
    int noOfLegs;

    void Eat(){
        System.out.println("Using mouth");
    }

    abstract void walk();
    abstract void makeSound();
}
