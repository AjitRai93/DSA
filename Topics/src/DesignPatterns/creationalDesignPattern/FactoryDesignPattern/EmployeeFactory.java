package DesignPatterns.creationalDesignPattern.FactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String emp){

        if(emp.equalsIgnoreCase("Android")){
            return new AndroidDeveloper();
        }else if (emp.equalsIgnoreCase("React")){
            return new ReactDeveloper();
        }else {
            return null;
        }
    }
}
