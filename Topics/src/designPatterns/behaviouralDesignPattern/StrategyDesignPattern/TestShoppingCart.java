package designPatterns.behaviouralDesignPattern.StrategyDesignPattern;

public class TestShoppingCart {
    public static void main(String[] args) {
        Item item = new Item("Bag",2600);
        Item item1 = new Item("Wallet",1200);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item);
        shoppingCart.addItem(item1);

        shoppingCart.Pay(new UpiPayment("xyz@upi"));
    }
}
