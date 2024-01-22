package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public class VanillaIceCream extends IceCream{

    @Override
    int cost() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Vanilla";
    }
}
