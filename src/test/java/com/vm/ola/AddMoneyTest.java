package com.vm.ola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddMoneyTest {

    @Test
    void addPennyToVendingMachine(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("penny");
        int actual = 1;
        int expected = vendingMachine.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addNickelToVendingMachine(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("nickel");
        int actual = 5;
        int expected = vendingMachine.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addDimeToVendingMachine(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("dime");
        int actual =10;
        int expected = vendingMachine.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addQuarterToVendingMachine(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("quarter");
        int actual =25;
        int expected = vendingMachine.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addAllCoinsToVendingMachine(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("penny");
        vendingMachine.addMoney("nickel");
        vendingMachine.addMoney("dime");
        vendingMachine.addMoney("quarter");
        int actual =41;
        int expected = vendingMachine.getBalance();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addAllCoinsUppercase(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("PENNY");
        vendingMachine.addMoney("NICKEL");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual =41;
        int expected = vendingMachine.getBalance();
        Assertions.assertEquals(expected, actual);
    }

}
