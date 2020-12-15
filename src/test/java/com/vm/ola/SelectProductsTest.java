package com.vm.ola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SelectProductsTest {

    @Test
    void selectCoke(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("QUARTER");
        int actual = 0;
        int expected = vendingMachine.selectProducts("coke");
        assertEquals(expected, actual);
    }

    @Test
    void selectCokeUppercase(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("QUARTER");
        int actual = 0;
        int expected = vendingMachine.selectProducts("COKE");
        assertEquals(expected, actual);
    }

    @Test
    void cokeNotAvailable(){
        VendingMachine vendingMachine = new VendingMachine(0,1,1);
        vendingMachine.addMoney("QUARTER");
        int actual = -1;
        int expected = vendingMachine.selectProducts("coke");
        assertEquals(expected, actual);
    }
    @Test
    void selectCokeCollectChange(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = 10;
        int expected = vendingMachine.selectProducts("coke");
        assertEquals(expected, actual);
    }


    @Test
    void selectPepsi(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = 0;
        int expected = vendingMachine.selectProducts("pepsi");
        assertEquals(expected, actual);
    }

    @Test
    void selectPepsiUppercase(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = 0;
        int expected = vendingMachine.selectProducts("PEPSI");
        assertEquals(expected, actual);
    }

    @Test
    void pepsiNotAvailable(){
        VendingMachine vendingMachine = new VendingMachine(1,0,1);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = -1;
        int expected = vendingMachine.selectProducts("pepsi");
        assertEquals(expected, actual);
    }

    @Test
    void selectPepsiCollectChange(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = 10;
        int expected = vendingMachine.selectProducts("pepsi");
        assertEquals(expected, actual);
    }


    @Test
    void selectSoda(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = 0;
        int expected = vendingMachine.selectProducts("soda");
        assertEquals(expected, actual);
    }

    @Test
    void selectSodaUppercase(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = 0;
        int expected = vendingMachine.selectProducts("SODA");
        assertEquals(expected, actual);
    }

    @Test
    void sodaNotAvailable(){
        VendingMachine vendingMachine = new VendingMachine(1,1,0);
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("QUARTER");
        int actual = -1;
        int expected = vendingMachine.selectProducts("soda");
        assertEquals(expected, actual);
    }

    @Test
    void selectSodaCollectChange(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("QUARTER");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("DIME");
        vendingMachine.addMoney("NICKEL");
        int actual = 5;
        int expected = vendingMachine.selectProducts("soda");
        assertEquals(expected, actual);
    }
}
