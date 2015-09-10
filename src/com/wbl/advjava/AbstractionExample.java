package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public class AbstractionExample {

    public static void main(String[] args) {
        Vehicle v = new Car();

        Flyer f = new Aeroplane();

    }

    public void dmvRegistration(Vehicle v) {
        if (v.odoMeterReading() > 100000) {

        }
    }

    public void Airport(Flyer f) {

    }
}
