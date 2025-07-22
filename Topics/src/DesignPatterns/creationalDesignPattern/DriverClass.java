package DesignPatterns.creationalDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DriverClass {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
        System.out.println("Singleton Instance S1: " + s1.hashCode());

        Constructor<SingletonDesignPattern> constructor = SingletonDesignPattern.class.getDeclaredConstructor();
        System.out.println("Constructor: " + constructor);
        constructor.setAccessible(true);
        SingletonDesignPattern s2 = constructor.newInstance();
        System.out.println("Singleton Instance S1: " + s1.hashCode());


    }
}
