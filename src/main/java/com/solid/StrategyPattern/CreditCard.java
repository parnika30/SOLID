package com.solid.StrategyPattern;

public abstract class CreditCard {

    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String cardHolderName;

    //getters and setters

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();


//    solved - multiple strategies to do something
//    1. make interface for separate algorithms.
//    2. impl for this interface for writing the algo.
//    3. use composition(this.algoName => make a new obj) to use the algo


}
