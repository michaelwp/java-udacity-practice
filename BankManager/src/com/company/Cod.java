package com.company;

import java.util.Date;

public class Cod extends BankAccount{
    private Date expires = null;

    // cods setter
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    // cods getter
    public Date getExpires() {
        return this.expires;
    }
}
