package com.wbl.oop;

/**
 * Created by Sampath on 9/2/2015.
 */
public class Student {


    public int id;
    public String name;
    public String ssn;


    /*public Student() {
        System.out.println("Student object is created!!! Default constructor is used!!!");
    }
*/
    public Student(int id) {
        this.id = id;
        System.out.println("Student object is created!!! Constructor with single parameter is used!!!");
    }

    public Student(int id, String name) {
        this(id);
        this.name = name;
        System.out.println("Student object is created!!! Constructor with two parameters is used!!!");
    }

    public void enroll(String year) {

    }

    public void enroll(int year) {

    }

    public void enroll(String year, String course) {

    }

    public void enroll(String year, String course, String enrollmentType) {

    }

}
