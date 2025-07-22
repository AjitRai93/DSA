package DesignPatterns.creationalDesignPattern;

public class SingletonDesignPattern {

    // private constructor to prevent instantiation
    private SingletonDesignPattern(){
        // Prevent reflection attack
        if(instance != null) {
            throw new IllegalStateException("Singleton instance already created trying to break singleton pattern");
        }
    }

    private static SingletonDesignPattern instance;

    //Lazy Initialization Singleton Design Pattern
    //Making a singleton class thread-safe
    public static SingletonDesignPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonDesignPattern.class) {
                if (instance == null) { // double-checked locking
                    // Lazy initialization
                    instance = new SingletonDesignPattern();
                }
                return instance;
            }
        }
        return instance;
    }

    public Object readResolve() {
        // Prevents serialization attack
        return getInstance();
    }

    public Object clone() throws CloneNotSupportedException {
        // Prevents cloning attack
        throw new CloneNotSupportedException("Singleton class cannot be cloned");
    }
}
