package DesignPatterns.creationalDesignPattern.AbstractFactoryDesignPattern;

public class DriverClient {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println("Employee Details: "+e1.getName());

        Employee e2 = EmployeeFactory.getEmployee(new ReactDevFactory());
        System.out.println("Employee Details: "+e2.getName());
    }
}
