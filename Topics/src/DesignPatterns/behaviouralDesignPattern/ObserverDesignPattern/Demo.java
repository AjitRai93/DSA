package DesignPatterns.behaviouralDesignPattern.ObserverDesignPattern;

public class Demo {

    public static void main(String[] args) {
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();
        Subscriber3 subscriber3 = new Subscriber3();

        YouTubeChannel youTubeChannel = new YouTubeChannel();
        youTubeChannel.attach(subscriber1);
        youTubeChannel.attach(subscriber2);

        youTubeChannel.notify(new Message("New Video has been uploaded of Design Pattern"));

        youTubeChannel.attach(subscriber3);
        youTubeChannel.detach(subscriber2);
        youTubeChannel.notify(new Message("New Video on DSA"));


    }
}
