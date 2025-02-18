package com.solid.DIP.impl;

import com.solid.DIP.CreditCard;
import com.solid.DIP.RefundCompatibleCC;
import com.solid.DIP.RefundStrategy;
import com.solid.DIP.UpiCompatibleCC;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCC, RefundCompatibleCC {

    private final RefundStrategy refundStrategy;
    public RupayCreditCard(RefundStrategy refundStrategy) {
        this.refundStrategy =  refundStrategy;
    }

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
        this.refundStrategy.refund();
        System.out.print("same source refund");
    }
}
