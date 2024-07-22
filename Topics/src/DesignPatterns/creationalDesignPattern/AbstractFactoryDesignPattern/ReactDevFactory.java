package DesignPatterns.creationalDesignPattern.AbstractFactoryDesignPattern;

public class ReactDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new ReactDeveloper();
    }
}
