package com.wbl.basic;

/**
 * Created by Sampath on 8/19/2015.
 */
public class Account {

    private int accountNumber;
    private double accountBalance;
    private String accountPrimaryAddress;

    public Account()
    {
        //db
        //conn
        //stnt//
        //25
        this.accountBalance = 25;
    }


    public String getAccountPrimaryAddress() {
        if(accountPrimaryAddress == null)
        {
            return "No Address";
        }
        return accountPrimaryAddress;
    }

    public void setAccountPrimaryAddress(String accountPrimaryAddress) {
        this.accountPrimaryAddress = accountPrimaryAddress;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }



}
