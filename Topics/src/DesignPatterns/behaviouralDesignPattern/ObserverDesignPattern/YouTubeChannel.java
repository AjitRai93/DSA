package DesignPatterns.behaviouralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notify(Message message) {
        for (Observer observer:observerList){
            observer.processNotificationMessage(message);
        }
    }
}
