package com.wbl.oop;

/**
 * Created by Sampath on 9/2/2015.
 */
public class Account extends Object {

    public int accountNumber;
    public double accountBalance;
    public String customerName;

   /* public Account()
    {

    }
*/

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public boolean equals(Object o) {
        Account a2 = (Account) o;

        if (this.accountNumber == a2.accountNumber) {
            return true;
        }
        return false;
    }

    public String toString() {
        return accountNumber + ":" + accountBalance;
    }
}
