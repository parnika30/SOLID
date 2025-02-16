package com.solid.ISP.ProblematicCode;

public abstract class CreditCard {
    //abstract class because

    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String cardHolderName;

    //getters and setters

    public abstract void swipeAndPay();
    public abstract void doRefund(); //not allowed for diners cc
    public abstract void onlinePayment();
    public abstract void tapAndPay();
    public abstract void upiPayment();  //upi only on rupay cc, not allowed on visa, diners.


//    every card has some different functions, some card will support and some will not.
//    problems -
//    violates LSP ,
//    behaviour has cross combinations - TIGHTLY coupled - violates ISP ,
//    forced impl of the methods
}
