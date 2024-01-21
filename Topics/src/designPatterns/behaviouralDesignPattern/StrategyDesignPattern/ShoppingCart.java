package designPatterns.behaviouralDesignPattern.StrategyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    PaymentStrategy paymentStrategy;

    List<Item> items;

    public ShoppingCart() {
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum =0;
        for (Item item: items){
            sum = sum + item.getPrice();
        }
        return sum;
    }

    public void Pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

}
