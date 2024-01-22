package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public class RainbowDecorator extends IceCreamDecorator{

    IceCream iceCream;

    public RainbowDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() +"with RainbowSprinkled is Added";
    }

    @Override
    int cost() {
        return iceCream.cost()+ 20;
    }
}
