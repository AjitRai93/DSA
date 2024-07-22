package DesignPatterns.creationalDesignPattern.FactoryDesignPattern;

/*
* Factory design Pattern
* When there is a superclass and multiple subclass and if we want to get the object of the Subclasses
* based on the input or requirement.
* */

public class ClientDriverClass {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android");
        System.out.println("Salary of Android Developer Employee: "+employee.getSalary());

        Employee employee1 = EmployeeFactory.getEmployee("React");
        System.out.println("Salary of Android React Employee: "+employee1.getSalary());
    }
}
