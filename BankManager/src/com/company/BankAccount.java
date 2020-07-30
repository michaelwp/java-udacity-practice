package com.company;

public class BankAccount {
    // private fields
    private String account;
    private Double balance;

    // accounts setter
    public void setAccount(String account){
        this.account = account;
    }

    // accounts getter
    public String getAccount(){
        return this.account;
    }

    // balances setter
    public void setBalance(Double balance){
        this.balance = balance;
    }

    // balances getter
    public Double getBalance(){
        return this.balance;
    }
}
