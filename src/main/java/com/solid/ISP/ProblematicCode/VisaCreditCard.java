package com.solid.ISP.ProblematicCode;

public class VisaCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {

    }

    @Override
    public void doRefund() {

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
