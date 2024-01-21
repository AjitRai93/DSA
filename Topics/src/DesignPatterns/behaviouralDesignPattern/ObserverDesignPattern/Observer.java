package DesignPatterns.behaviouralDesignPattern.ObserverDesignPattern;

public interface Observer {
    //call update() to inform all the observers about the changes in the subject
    public void processNotificationMessage(Message m);
}
