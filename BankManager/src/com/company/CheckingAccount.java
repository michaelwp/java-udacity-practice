package com.company;

public class CheckingAccount extends BankAccount {
    // private list
    private Double limit;

    // limits setter
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    // limits getter
    public Double getLimit() {
        return this.limit;
    }
}
