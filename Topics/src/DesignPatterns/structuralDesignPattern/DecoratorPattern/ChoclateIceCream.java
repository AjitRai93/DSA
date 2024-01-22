package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public class ChoclateIceCream extends IceCream{

    @Override
    public String getDescription() {
        return "Chocolate";
    }

    @Override
    int cost() {
        return 60;
    }
}
