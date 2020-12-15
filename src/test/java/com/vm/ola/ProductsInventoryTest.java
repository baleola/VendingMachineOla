package com.vm.ola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductsInventoryTest {

    @Test
    void getProductsNewVendingMachine(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        int[] actual = {1,1,1};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }



    @Test
    void getProductsAfterCokeRefill(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("coke", 10);
        int[] actual = {11,1,1};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }


    @Test
    void getProductsAfterPepsiRefill(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("pepsi", 2);
        int[] actual = {1,3,1};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }

    @Test
    void getProductsAfterSodaRefill(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("soda", 5);
        int[] actual = {1,1,6};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }

    @Test
    void getProductsAfterMultipleRefills(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.refill("coke", 10);
        vendingMachine.refill("pepsi", 2);
        vendingMachine.refill("soda", 5);
        int[] actual = {11,3,6};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }

    @Test
    void getProductsAfterCokePurchase(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("quarter");
        vendingMachine.addMoney("quarter");
        vendingMachine.addMoney("quarter");
        vendingMachine.selectProducts("coke");
        int[] actual = {0,1,1};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }

    @Test
    void getProductsAfterPepsiPurchase(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("quarter");
        vendingMachine.addMoney("quarter");
        vendingMachine.addMoney("quarter");
        vendingMachine.selectProducts("pepsi");
        int[] actual = {1,0,1};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }

    @Test
    void getProductsAfterSodaPurchase(){
        VendingMachine vendingMachine = new VendingMachine(1,1,1);
        vendingMachine.addMoney("quarter");
        vendingMachine.addMoney("quarter");
        vendingMachine.addMoney("quarter");
        vendingMachine.selectProducts("soda");
        int[] actual = {1,1,0};
        int[] expected = vendingMachine.getProducts();
        assertArrayEquals(actual,expected);
    }
}
