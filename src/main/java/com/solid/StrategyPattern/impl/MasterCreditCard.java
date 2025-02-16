package com.solid.StrategyPattern.impl;

import com.solid.StrategyPattern.CreditCard;
import com.solid.StrategyPattern.RefundCompatibleCC;
import com.solid.StrategyPattern.RefundStrategy;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCC {

    private final RefundStrategy refundStrategy;
    public MasterCreditCard() {
        this.refundStrategy =  new BankRefund();
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
        this.refundStrategy.refund();
        System.out.print("bank refund");
    }
}
