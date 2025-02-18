package com.solid.StrategyPatternDIP.impl;

import com.solid.StrategyPatternDIP.CreditCard;

public class DinersCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {}

    @Override
    public void onlinePayment() {}

    @Override
    public void tapAndPay() {}
}
