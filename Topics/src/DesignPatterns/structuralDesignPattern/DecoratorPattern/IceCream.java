package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public abstract class IceCream {
    String description;

    abstract int cost();

    public String getDescription() {
        return description;
    }
}
