package DesignPatterns.structuralDesignPattern.DecoratorPattern;

public class Customer {
    public static void main(String[] args) {
        IceCream iceCream = new ButterScotchIceCream();
        iceCream = new ChocolateSyrupDecorator(iceCream);
        iceCream = new ChocoChipsDecorator(iceCream);

        System.out.println("Cost of IceCream"+iceCream.cost());
        System.out.println("IceCream topping description: "+iceCream.getDescription());
    }
}
