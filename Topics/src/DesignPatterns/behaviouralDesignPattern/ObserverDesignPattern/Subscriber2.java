package DesignPatterns.behaviouralDesignPattern.ObserverDesignPattern;

public class Subscriber2 implements Observer{
    @Override
    public void processNotificationMessage(Message m) {
        System.out.println("Subscriber2 received the notification: "+m.getMessage());
    }
}
