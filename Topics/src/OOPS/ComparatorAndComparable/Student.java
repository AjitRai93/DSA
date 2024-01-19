package OOPS.ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student(107,"Ajit"),
                new Student(103,"Ankit"),
                new Student(101,"Rahul"),
                new Student(102,"Ram"));

        System.out.println("Before Sorting List is: "+studentList);
        //Using Comparator to sort by Id
        Collections.sort(studentList,new IdComparator());
        System.out.println("After Sorting List By ID is: "+studentList);

        //Using Comparator to sort by Name
        Collections.sort(studentList,new NameComparator());
        System.out.println("After Sorting List By ID is: "+studentList);
    }
}
