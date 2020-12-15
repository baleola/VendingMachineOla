package com.vm.ola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RefillTest {

    @Test
    void cokeRefill(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("coke", 1);
        int[] actual = {2,1,1};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }


    @Test
    void pepsiRefill(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("pepsi", 5);
        int[] actual = {1,6,1};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }

    @Test
    void sodaRefill(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("soda", 10);
        int[] actual = {1,1,11};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }

    @Test
    void multipleRefills(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("coke", 1);
        vendingMachine.refill("pepsi", 1);
        vendingMachine.refill("soda", 1);
        int[] actual = {2,2,2};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }
}
