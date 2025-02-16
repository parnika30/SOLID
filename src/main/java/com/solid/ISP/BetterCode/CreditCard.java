package com.solid.ISP.BetterCode;

public abstract class CreditCard {
    //no forceful behavior.
    // only mandatory methods

    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String cardHolderName;

    //getters and setters

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();



    //problems -
    // 1. what if a particular card stops a functionality, we have to again segregate the code and create a new interface.
    //2. code duplication wrt the same methods => can be solved through strategy pattern.

}
