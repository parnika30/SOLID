package com.solid.DIP.impl;

import com.solid.DIP.CreditCard;
import com.solid.DIP.RefundCompatibleCC;
import com.solid.DIP.RefundStrategy;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCC {


    private final RefundStrategy refundStrategy;
    public MasterCreditCard(RefundStrategy refundStrategy) {
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
        this.refundStrategy.refund();
        System.out.print("bank refund");
    }
}
