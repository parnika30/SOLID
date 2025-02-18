package com.solid.DIP.impl;

import com.solid.DIP.CreditCard;
import com.solid.DIP.RefundCompatibleCC;
import com.solid.DIP.RefundStrategy;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCC {

    private final RefundStrategy refundStrategy;
    public VisaCreditCard (RefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }
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
        refundStrategy.refund();
        System.out.print("refund strategy");
    }
}
