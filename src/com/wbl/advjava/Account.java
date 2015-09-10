package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public class Account {
    private static double interestRate;
    public final String SSN;
    public int accountNumber;
    public double accountBalance;

    public Account(int id) {
        //goto db
        SSN = "";
    }


    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public final double getAccountBalance() {
        return accountBalance + (accountBalance * interestRate);
    }


}
