package com.solid.ISP.ProblematicCode;

public class RupayCreditCard extends CreditCard{
    @Override
    public void swipeAndPay() {}

    @Override
    public void doRefund() {}

    @Override
    public void onlinePayment() {}

    @Override
    public void tapAndPay() {}

    @Override
    public void upiPayment() {
        //no exception
    }
}
