package com.solid.StrategyPattern.impl;

import com.solid.StrategyPattern.CreditCard;
import com.solid.StrategyPattern.RefundCompatibleCC;
import com.solid.StrategyPattern.RefundStrategy;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCC {

    private final RefundStrategy refundStrategy;
    public VisaCreditCard (RefundStrategy refundStrategy) {
        this.refundStrategy =  refundStrategy;
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
