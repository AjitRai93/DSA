package OOPS.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Comparable implements Comparable<Student_Comparable>{
    private  int id;
    private String name;

    public Student_Comparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*Only Single Attribute sorting can be done using Comparable*/
    @Override
    public int compareTo(Student_Comparable obj) {
        if(id == obj.id){
            return 0;
        } else if (id > obj.id) {
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student_Comparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student_Comparable> studentComparableList = new ArrayList<>();
        Student_Comparable student = new Student_Comparable(101,"XYZ");
        Student_Comparable student1 = new Student_Comparable(109,"ppp");
        Student_Comparable student2 = new Student_Comparable(105,"abc");
        Student_Comparable student3 = new Student_Comparable(103,"zzz");

        studentComparableList.add(student);
        studentComparableList.add(student1);
        studentComparableList.add(student2);
        studentComparableList.add(student3);
        System.out.println("Student List before sorting: "+studentComparableList);

        Collections.sort(studentComparableList);

        System.out.println("Student List after sorting: "+studentComparableList);

    }
}
