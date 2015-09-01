package com.wbl.oop;

import com.wbl.basic.Address;

/**
 * Created by Sampath on 8/31/2015.
 */
public class Employee {

    protected int id;
    protected String name;
    protected double salary;
    protected Address homeAddress;

    public String getDetails() {
        return "Name: " + name + ", Salary:" + salary;
    }

}
