package com.vm.ola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceTest {

    @Test
    void checkZeroBalance(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);

        int actual = 0;
        int expected = vendingMachine.getBalance();
        assertEquals(actual,expected);
    }

    @Test
    void checkPositiveBalance(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("quarter");
        int actual = 25;
        int expected = vendingMachine.getBalance();
        assertEquals(actual,expected);
    }
}
