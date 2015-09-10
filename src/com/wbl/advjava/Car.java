package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public class Car extends Vehicle {

    @Override
    public double odoMeterReading() {
        return 100000;
    }

    @Override
    public double mpg() {
        return 25;
    }


}
