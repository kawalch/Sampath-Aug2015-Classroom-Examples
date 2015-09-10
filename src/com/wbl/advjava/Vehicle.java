package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public abstract class Vehicle {

    public String make;
    public String model;

    public Vehicle() {
        make = " ";
        model = " ";
    }

    public abstract double odoMeterReading();

    public abstract double mpg();

    public void getDetails() {
        String something = "";
    }
}
