package com.vm.ola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResetTest {

    @Test
    void resetVendingMachine(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.resetVendingMachine();
        int[] actual = {0,0,0};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }
}
