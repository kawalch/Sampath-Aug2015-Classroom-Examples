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

        System.out.println(m1.getDetails());

        Manager m2 = new Manager();
        m2.id = 103;
        m2.name = "UIPROGRAMMER";
        m2.salary = 3000;
        m2.department = "QA";

        Employee e2 = m2;

        System.out.println(e2.getDetails());

    }
}
