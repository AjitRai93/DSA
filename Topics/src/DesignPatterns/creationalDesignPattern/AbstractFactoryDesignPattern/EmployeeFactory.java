package DesignPatterns.creationalDesignPattern.AbstractFactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
