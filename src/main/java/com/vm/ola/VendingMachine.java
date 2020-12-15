package com.vm.ola;

public class VendingMachine {

    static final int COKE_PRICE = 25;
    static final int PEPSI_PRICE = 35;
    static final int SODA_PRICE = 45;
    static final int PENNY = 1;
    static final int NICKEL = 5;
    static final int DIME = 10;
    static final int QUARTER = 25;


    private boolean cokeIsAvailable = true;
    private boolean pepsiIsAvailable = true;
    private boolean sodaIsAvailable = true;
    private int coke;
    private int pepsi;
    private int soda;
    private int balance = 0;


    public VendingMachine(int coke, int pepsi, int soda) {
        this.coke = coke;
        this.pepsi = pepsi;
        this.soda = soda;
        this.balance = balance;
    }

    public void addMoney(String amount) {

        String successMessage = "Money Added";
        switch (amount.toLowerCase()) {
            case "penny":
                balance += PENNY;
                System.out.println(successMessage);
                break;
            case "nickel":
                balance += NICKEL;
                System.out.println(successMessage);
                break;
            case "dime":
                balance += DIME;
                System.out.println(successMessage);
                break;
            case "quarter":
                balance += QUARTER;
                System.out.println(successMessage);
                break;
        }
    }

    public int getBalance() {
        return balance;
    }

    public int[] getProducts() {
        int[] productsArray = {coke, pepsi, soda};
        String[] productNames = {"Coke","Pepsi","Soda"};

        for (int i = 0; i < productsArray.length ; i++) {
            System.out.println(productNames[i] + ": " + productsArray[i]);
        }
        return productsArray;
    }

    public int refund() {
        int refundAmount = Math.max(balance, 0);
        return balance;
    }

    public void resetVendingMachine() {
        balance = 0;
        coke = 0;
        pepsi = 0;
        soda = 0;
    }

    public void refill(String productName, int quantity) {
        switch (productName.toLowerCase()) {
            case "coke":
                coke += quantity;
                cokeIsAvailable = true;
                System.out.println("Coke Quantity:" + coke);
                break;
            case "pepsi":
                pepsi += quantity;
                pepsiIsAvailable = true;
                System.out.println("Pepsi Quantity:" + pepsi);
                break;
            case "soda":
                soda += quantity;
                sodaIsAvailable = true;
                System.out.println("Soda Quantity:" + soda);
                break;
        }

    }


    public int selectProducts(String product) {
        final int error = -1;
        switch (product.toLowerCase()) {
            case "coke":
                if (coke == 0) cokeIsAvailable = false;
                if (!cokeIsAvailable) {
                    System.out.println(product + " sold out");
                    return error;
                } else if (balance <= 0 || balance - COKE_PRICE < 0) {
                    System.out.println("Insufficient funds." + " Please insert at least " + COKE_PRICE + " to purchase a " + product);
                    return error;
                }
                balance -= COKE_PRICE;
                coke -= 1;
                System.out.println("Coke dispensed. Your change is : " + balance);
                return balance;

            case "pepsi":
                if (pepsi == 0) pepsiIsAvailable = false;
                if (!pepsiIsAvailable) {
                    System.out.println(product + " sold out");
                    return error;
                } else if (balance <= 0 || balance - PEPSI_PRICE < 0) {
                    System.out.println("Insufficient funds." + " Please insert at least " + PEPSI_PRICE + " to purchase a " + product);
                    return error;
                }
                balance -= PEPSI_PRICE;
                pepsi -= 1;
                System.out.println("Pepsi dispensed. Your change is : " + balance);
                return balance;


            case "soda":
                if (soda == 0) sodaIsAvailable = false;
                if (!sodaIsAvailable) {
                    System.out.println(product + " sold out");
                    return error;
                } else if (balance <= 0 || balance - SODA_PRICE < 0) {
                    System.out.println("Insufficient funds." + " Please insert at least " + SODA_PRICE + " to purchase a " + product);
                    return error;
                }
                balance -= SODA_PRICE;
                soda -= 1;
                System.out.println("Soda dispensed. Your change is : " + balance);
                return balance;

            default:
                return error;
        }
    }
}
