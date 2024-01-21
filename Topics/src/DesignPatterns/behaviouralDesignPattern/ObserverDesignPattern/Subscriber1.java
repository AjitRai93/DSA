package DesignPatterns.behaviouralDesignPattern.ObserverDesignPattern;

public class Subscriber1 implements Observer{
    @Override
    public void processNotificationMessage(Message m) {
        System.out.println("Subscriber1 received te message: "+m.getMessage());
    }
}
