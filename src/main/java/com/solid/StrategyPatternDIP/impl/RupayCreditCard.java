package com.solid.StrategyPatternDIP.impl;

import com.solid.StrategyPatternDIP.CreditCard;
import com.solid.StrategyPatternDIP.RefundCompatibleCC;
import com.solid.StrategyPatternDIP.RefundStrategy;
import com.solid.StrategyPatternDIP.UpiCompatibleCC;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCC, RefundCompatibleCC {

    private final RefundStrategy refundStrategy;
    public RupayCreditCard() {
        this.refundStrategy =  new SameSourceRefund();
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
