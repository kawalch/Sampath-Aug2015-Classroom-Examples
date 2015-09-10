package com.wbl.oop;

/**
 * Created by Sampath on 8/31/2015.
 */
public class Manager extends Employee {

    protected String department;

    public String getDepartment() {
        return "Department: " + department;
    }

    public String getDetails() {
        return super.getDetails() + " ," + this.getDepartment();
    }
    //is a relationship
    //subclassing


}
