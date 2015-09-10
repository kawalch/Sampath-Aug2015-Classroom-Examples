package com.wbl.advjava;

import java.sql.Connection;

/**
 * Created by Sampath on 9/9/2015.
 */
public class FinalExample {

    //final variables - instance or static //constants
    //final methods //no overriding
    //final classes - no inheritance

    //final, finally and finalize


    public static final double PI = 3.14;


    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        d = null;
        System.gc();


        //Connection conn = null;

        /*try
        {
            conn.createStatement();
        }
        catch(Exception ex)
        {

        }
        finally {
            if(conn != null && conn.isClosed())
            {
                conn.close();
            }
        }*/
    }


}
