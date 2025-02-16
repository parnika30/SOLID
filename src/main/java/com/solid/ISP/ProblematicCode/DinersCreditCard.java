package com.solid.ISP.ProblematicCode;

public class DinersCreditCard extends CreditCard{
    @Override
    public void swipeAndPay() {

    }

    @Override
    public void doRefund() {
    //will throw an exception
    }

    @Override
    public void onlinePayment() {

    }

    @Override
    public void tapAndPay() {

    }

    @Override
    public void upiPayment() {
    //will throw an exception
    }
}
