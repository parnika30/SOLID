package com.solid.StrategyPatternDIP.impl;

import com.solid.StrategyPatternDIP.CreditCard;
import com.solid.StrategyPatternDIP.RefundCompatibleCC;
import com.solid.StrategyPatternDIP.RefundStrategy;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCC {

    private final RefundStrategy refundStrategy;
    public MasterCreditCard(BankRefund bankRefund) {
        this.refundStrategy =  new BankRefund();
        //initialising with a different class object rather than same class obj here is called Dependency inversion principle.
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
