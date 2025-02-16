package com.solid.ISP.BetterCode;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCC{
    @Override
    public void swipeAndPay() {

    }

    @Override
    public void onlinePayment() {

    }

    @Override
    public void tapAndPay() {

    }

    @Override
    public void refund() {

    }
}
