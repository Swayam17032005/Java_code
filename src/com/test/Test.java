package com.test;

import com.student.Student;

public class Test extends Student {
    public static void main(String[] args) {
        Student s1 = new Student("Rohan", "AI", 67, 20);
        Test t1 = new Test();
       
        System.out.println("The student name is " + s1.Name);
    }
}
