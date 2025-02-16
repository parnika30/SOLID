package com.solid.ISP.BetterCode;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCC, RefundCompatibleCC {
    @Override
    public void swipeAndPay() {}

    @Override
    public void onlinePayment() {}

    @Override
    public void tapAndPay() {}

    @Override
    public void upiPayment() {

    }

    @Override
    public void refund() {

    }
}
