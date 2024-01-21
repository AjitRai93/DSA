package DesignPatterns.behaviouralDesignPattern.ObserverDesignPattern;

public interface Subject {

    //call attach() to add Subscribers to the observer list
    public void attach(Observer observer);

    //call detach() to remove Subscribers from the observer list
    public void detach(Observer observer);

    //call notify() to publish all the changes made by the subject
    public void notify(Message message);
}
