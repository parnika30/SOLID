package com.solid.StrategyPatternDIP;

import com.solid.StrategyPatternDIP.impl.BankRefund;
import com.solid.StrategyPatternDIP.impl.MasterCreditCard;
import com.solid.StrategyPatternDIP.impl.RupayCreditCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidApplication.class, args);
        CreditCard cc1 = new MasterCreditCard(new BankRefund());
        CreditCard cc2 = new RupayCreditCard();
    }

}
