package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public class Document {

    public Printer printer;

    public void print() {

    }


    public void finalize() {
        printer.close();
    }


}
