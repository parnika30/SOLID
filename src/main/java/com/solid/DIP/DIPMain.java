package com.solid.DIP;

import com.solid.DIP.impl.MasterCreditCard;
import com.solid.DIP.impl.RupayCreditCard;
import com.solid.DIP.impl.BankRefund;
import com.solid.DIP.impl.SameSourceRefund;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DIPMain {

    public static void main(String[] args) {
        SpringApplication.run(DIPMain.class, args);
        CreditCard cc1 = new MasterCreditCard(new BankRefund());
        CreditCard cc2 = new RupayCreditCard(new SameSourceRefund());
    }

}
