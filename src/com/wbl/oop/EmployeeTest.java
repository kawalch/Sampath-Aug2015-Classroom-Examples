package com.wbl.oop;

/**
 * Created by Sampath on 8/31/2015.
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "WBL";
        e1.salary = 1000;
        System.out.println(e1.getDetails());

        Manager m1 = new Manager();
        m1.id = 102;
        m1.name = "WBQA";
        m1.salary = 2000;
        m1.department = "IT";

        System.out.println(m1.getDetails() + m1.getDepartment());


    }
}
