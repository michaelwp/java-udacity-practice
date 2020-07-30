package com.company;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
        /* CHECKINGS ACCOUNT */

	    // instance of checking account
        CheckingAccount checkingAccount = new CheckingAccount();

        // set checking account
        checkingAccount.setAccount("123456");
        checkingAccount.setBalance((double) 1000000);
        checkingAccount.setLimit((double) 1500000);

        // get checking account
        System.out.println(checkingAccount.getAccount());
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.getLimit());

        /* SAVINGS ACCOUNT */

        // instance of saving account
        SavingAccount savingAccount = new SavingAccount();

        // set saving account
        savingAccount.setAccount("4567890");
        savingAccount.setBalance((double) 1200000);
        savingAccount.setTransfers(10);

        // get saving account
        System.out.println(savingAccount.getAccount());
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getTransfers());

        /* COD */

        // instance of saving account
        Cod cod = new Cod();

        // set cod
        cod.setAccount("0987654");
        cod.setBalance((double) 9900000);

        // set date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            cod.setExpires(dateFormat.parse("2020-09-08"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // get cod
        System.out.println(cod.getAccount());
        System.out.println(cod.getBalance());
        System.out.println(cod.getExpires());
    }
}
