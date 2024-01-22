package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public class ChocolateSyrupDecorator extends IceCreamDecorator{

    IceCream iceCream;

    public ChocolateSyrupDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "with Chocolate Syrup";
    }

    @Override
    int cost() {
        return iceCream.cost() + 30;
    }
}
