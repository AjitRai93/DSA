package Programs.Inheritance;


import java.util.Arrays;

public class Child extends  Parent{

    public void doSomething(String s) {
        System.out.println("Child doSomething is called");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.doSomething("test");
    }
}
