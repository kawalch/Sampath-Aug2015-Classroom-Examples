package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public class DesignPattern {

    //problem - best solution for it
    //problem statment - how to solve it.
    //Singleton Design Pattern
    //100 users logging in.
    //

    public static void main(String[] args) {
        Connection c1 = Connection.getConnection();
        Connection c2 = Connection.getConnection();

    }
}
