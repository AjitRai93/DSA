package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public class ButterScotchIceCream  extends IceCream{


    @Override
    public String getDescription() {
        return "ButterScotch";
    }

    @Override
    int cost() {
        return 50;
    }
}
