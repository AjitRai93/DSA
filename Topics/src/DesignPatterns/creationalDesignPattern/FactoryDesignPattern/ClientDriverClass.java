package DesignPatterns.creationalDesignPattern.FactoryDesignPattern;

public class ClientDriverClass {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android");
        System.out.println("Salary of Android Developer Employee: "+employee.getSalary());

        Employee employee1 = EmployeeFactory.getEmployee("React");
        System.out.println("Salary of Android React Employee: "+employee1.getSalary());
    }
}
