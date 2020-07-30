package com.company;

public class SavingAccount extends BankAccount {
    // private list
    private int transfers;

    // transfers setter
    public void setTransfers(int transfers) {
        this.transfers = transfers;
    }

    // transfers getter
    public int getTransfers() {
        return this.transfers;
    }
}
