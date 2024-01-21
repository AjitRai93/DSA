package DesignPatterns.behaviouralDesignPattern.ObserverDesignPattern;

public class Subscriber3 implements Observer{
    @Override
    public void processNotificationMessage(Message m) {
        System.out.println("Subscriber3 received the notification: "+m.getMessage());
    }
}
