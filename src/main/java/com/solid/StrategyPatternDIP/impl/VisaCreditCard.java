package com.solid.StrategyPatternDIP.impl;

import com.solid.StrategyPatternDIP.CreditCard;
import com.solid.StrategyPatternDIP.RefundCompatibleCC;
import com.solid.StrategyPatternDIP.RefundStrategy;

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
