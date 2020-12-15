package com.vm.ola;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Console console = System.console();
        Scanner scanner = new Scanner(System.in);
        console.writer().println("Welcome to the Vending Machine App. \nTo start, please create a new vending machine. \nWould you like to continue? Y or N\n");
        String userChoice = scanner.nextLine().toLowerCase();

        if (userChoice.equals("y")) {
            System.out.println("Great, let's continue.");
        } else {
            System.out.println("Thank you. Goodbye");
            System.exit(0);
        }

        console.writer().println("\n" +
                " __   __           _ _             __  __         _    _          \n" +
                " \\ \\ / /__ _ _  __| (_)_ _  __ _  |  \\/  |__ _ __| |_ (_)_ _  ___ \n" +
                "  \\ V / -_) ' \\/ _` | | ' \\/ _` | | |\\/| / _` / _| ' \\| | ' \\/ -_)\n" +
                "   \\_/\\___|_||_\\__,_|_|_||_\\__, | |_|  |_\\__,_\\__|_||_|_|_||_\\___|\n" +
                "                           |___/                                  \n");

        VendingMachine vm = new VendingMachine(1, 1, 1);


        do {
            console = System.console();


            console.writer().println("|___||___||___||___||___||___||___||___||___||___||___||___||___||___||___| ");

            console.writer().println("Balance: " + vm.getBalance());

            console.writer().println("|___||___||___||___||___||___||___||___||___||___||___||___||___||___||___| ");


            console.writer().println("Please Enter a command.\n" +
                    "To Buy a drink, please type 'buy'\n \n" +
                    "Choices are: Coke(25), Pepsi(35) or Soda(45)\n \n" +
                    "To insert money, please type 'money'\n" +
                    "To check your balance, please type 'balance' \n" +
                    "To get a refund, please type 'refund' \n" +
                    "To reset the vending machine, please type 'reset' \n" +
                    "To refill the vending machine, please type 'refill' \n" +
                    "To check the vending machine inventory, please type 'inventory' \n" +
                    "To exit the app, please type 'exit'");
            String userCommand = scanner.nextLine().toLowerCase();


            /* Exiting the app */
                if (userCommand.equals("exit")) {
                    System.exit(0);
                }

                //Refill
                if (userCommand.equals("refill")) {
                    console.writer().println("What drink would you like to refill? \n " +
                            "Choices are: Coke, Pepsi or Soda \n");
                    String drinkChoice = scanner.nextLine().toLowerCase();

                    String[] drinks = new String[]{"coke", "pepsi", "soda"};
                    boolean matchFound = Arrays.asList(drinks).contains(drinkChoice);

                    if (matchFound) {
                        console.writer().println("How many?");
                        int numberToRefill = Integer.parseInt(scanner.nextLine().toLowerCase());
                        vm.refill(drinkChoice, numberToRefill);
                    } else {
                        System.out.println("Please try again");
                    }
                }


                //Buying Drinks
                if (userCommand.equals("buy")) {
                    console.writer().println("What drink would you like? \n Choices are: Coke(25), Pepsi(35) or Soda(45)");
                    String drinkChoice = scanner.nextLine().toLowerCase();


                    String[] drinks = new String[]{"coke", "pepsi", "soda"};
                    boolean matchFound = Arrays.asList(drinks).contains(drinkChoice);

                    if (matchFound) {
                        vm.selectProducts(drinkChoice);
                    } else {
                        System.out.println("That drink is not available");
                    }
                }


                // Adding Money
                if (userCommand.equals("money")) {
                    console.writer().println("How much would you like to add? \n Choices are: Penny(1), Nickel(5), Dime(10) or Quarter(25)");
                    String amount = scanner.nextLine().toLowerCase();

                    String[] coins = new String[]{"penny", "nickel", "dime", "quarter"};
                    boolean matchFound = Arrays.asList(coins).contains(amount);


                    if (matchFound) {
                        vm.addMoney(amount);
                    } else {
                        System.out.println("Cannot accept that coin");
                    }
                }


                //Check balance
                if (userCommand.equals("balance")) {
                    System.out.println(vm.getBalance());
                }

                //Get Refund
                if (userCommand.equals("refund")) {
                    System.out.println("Refunded: " + vm.refund());
                }

                //Reset
                if (userCommand.equals("reset")) {
                    System.out.println("Machine Successfully Reset");
                    vm.resetVendingMachine();
                    vm.getProducts();
                }

                //Inventory
                if (userCommand.equals("inventory")) {
                    vm.getProducts();
                }


        }
        while (true);


    }

}
