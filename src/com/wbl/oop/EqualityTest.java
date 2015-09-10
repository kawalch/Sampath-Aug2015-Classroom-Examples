package com.wbl.oop;

/**
 * Created by Sampath on 9/2/2015.
 */
public class EqualityTest {

    public static void main(String[] args) {

        Manager m1 = new Manager();
        Manager m2 = m1;
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());



/*
        if(m1 == m2)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }*/


        Account a1 = new Account(101);
        Account a2 = new Account(101);

        if (a1.equals(a2)) {
            System.out.println("Business Equality");
        }

        //String interning
        String s1 = new String("WBQA");
        String s2 = s1;
        if (s1.equals(s2)) {
            System.out.println("String Equality");
        }

        System.out.println(a1.toString());


        /*int i = 10;
        int j = 10;

        if(i == j)
        {
            System.out.println("Equal");
        }*/
    }

}
