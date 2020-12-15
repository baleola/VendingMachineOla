package com.vm.ola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RefundTest {

    @Test
    void refundZero(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        int actual = 0;
        int expected = vendingMachine.refund();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void refundAfterInsert(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("penny");
        int actual = 1;
        int expected = vendingMachine.refund();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void refundAfterInsertMultiple(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("PENNY");
        vendingMachine.addMoney("NICKEL");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = 41;
        int expected = vendingMachine.refund();
        Assertions.assertEquals(expected, actual);
    }


}
