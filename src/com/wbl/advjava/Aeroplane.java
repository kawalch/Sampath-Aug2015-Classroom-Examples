package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public class Aeroplane extends Vehicle implements Flyer, Comparable<Aeroplane> {
    @Override
    public int compareTo(Aeroplane o) {
        return 0;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public double odoMeterReading() {
        return 0;
    }

    @Override
    public double mpg() {
        return 0;
    }
}
