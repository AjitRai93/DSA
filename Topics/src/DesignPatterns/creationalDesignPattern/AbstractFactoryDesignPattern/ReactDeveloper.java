package DesignPatterns.creationalDesignPattern.AbstractFactoryDesignPattern;

public class ReactDeveloper implements Employee {

    @Override
    public int getSalary() {
        return 60000;
    }

    @Override
    public String getName() {
        return "I am a React Developer";
    }
}
