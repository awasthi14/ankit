package com.sunbeam;


import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: The first input is not a valid double.");
            scanner.close();
            return;
        }
        double num1 = scanner.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: The second input is not a valid double.");
            scanner.close();
            return;
        }
        double num2 = scanner.nextDouble();

        // Calculate and print the average
        double average = (num1 + num2) / 2;
        System.out.println("The average of the two numbers is: " + average);

        // Close the scanner
        scanner.close();
        
    }
}