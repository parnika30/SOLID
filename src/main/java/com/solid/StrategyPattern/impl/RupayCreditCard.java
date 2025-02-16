package com.solid.StrategyPattern.impl;

import com.solid.StrategyPattern.CreditCard;
import com.solid.StrategyPattern.RefundCompatibleCC;
import com.solid.StrategyPattern.RefundStrategy;
import com.solid.StrategyPattern.UpiCompatibleCC;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCC, RefundCompatibleCC {

    private  RefundStrategy refundStrategy;
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
