package com.wbl.oop;

/**
 * Created by Sampath on 9/2/2015.
 */
public class PolymorphismTest {

    public static void main(String[] args) {


        Employee e1 = new Employee();

        Employee m1 = new Manager(); //This is implicit casting
        //Child to parent is implicit - upcasting.


        Manager m2 = (Manager) m1; //Explicit casting.



      /*  int i = 10;
        long l = i;

        //00000000000000000000000000100
        //00000000000000000000000000100 0  2 power 63 + 1
        //implicit casting

        int j = (int)l; //explicit casting
        System.out.println(j);*/
    }
}
