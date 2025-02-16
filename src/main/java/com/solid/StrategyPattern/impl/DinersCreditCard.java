package com.solid.StrategyPattern.impl;

import com.solid.StrategyPattern.CreditCard;

public class DinersCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {}

    @Override
    public void onlinePayment() {}

    @Override
    public void tapAndPay() {}
}
