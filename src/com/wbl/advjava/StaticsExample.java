package com.wbl.advjava;

/**
 * Created by Sampath on 9/9/2015.
 */
public class StaticsExample {

    public static void main(String[] args) {
        Account.setInterestRate(0.02);


        Account a1 = new Account();
        a1.accountNumber = 101;
        a1.accountBalance = 10000;

        Account a2 = new Account();
        a2.accountNumber = 102;
        a2.accountBalance = 12000;

        System.out.println(a1.accountNumber + ":" + a1.getAccountBalance());
        System.out.println(a2.accountNumber + ":" + a2.getAccountBalance());


        // System.out.println(a.accountNumber);

    }


}
