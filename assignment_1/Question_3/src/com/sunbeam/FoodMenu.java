package com.sunbeam;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        // Fixed prices for food items
        double dosaPrice = 50.0;
        double samosaPrice = 30.0;
        double idliPrice = 20.0;
        double burgerPrice = 40.0;
        double pizzaPrice = 120.0;

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        double totalBill = 0;

        while (true) {
            // Display food menu
            System.out.println("Food Menu:");
            System.out.println("1. Dosa - Rs. 50");
            System.out.println("2. Samosa - Rs. 30");
            System.out.println("3. Idli - Rs. 20");
            System.out.println("4. Burger - Rs. 40");
            System.out.println("5. Pizza - Rs. 120");
            System.out.println("6. Generate Bill");
            System.out.print("Please select an option (1-6): ");

            int choice = scanner.nextInt();

            if (choice == 6) {
                // Generate Bill
                System.out.println("Total Bill: Rs. " + totalBill);
                System.out.println("Thank you for your order!");
                break; // Exit the loop and terminate the program
            } else if (choice >= 1 && choice <= 5) {
                // Ask for quantity if the user selects a valid food item
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();

                // Add the cost to the total bill based on the selected food item
                switch (choice) {
                    case 1:
                        totalBill += dosaPrice * quantity;
                        break;
                    case 2:
                        totalBill += samosaPrice * quantity;
                        break;
                    case 3:
                        totalBill += idliPrice * quantity;
                        break;
                    case 4:
                        totalBill += burgerPrice * quantity;
                        break;
                    case 5:
                        totalBill += pizzaPrice * quantity;
                        break;
                }
                System.out.println("Item added to the bill.");
            } else {
                System.out.println("Invalid option. Please select a valid item (1-5) or 'Generate Bill' (6).");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
