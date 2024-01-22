package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public class ChocoChipsDecorator extends IceCreamDecorator{

    IceCream iceCream;

    public ChocoChipsDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    int cost() {
        return iceCream.cost() + 35;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "choco chips added";
    }
}
