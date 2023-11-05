package com.gradedprojectQ2;

import java.util.Scanner;
public class Question2 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number X: ");
        double x = readDouble(scanner);
        System.out.print("Enter the power N: ");
        int n = readInt(scanner);

        double result = calculatePower(x, n);

        System.out.println("X power N is: " + result);
    }

    public static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * calculatePower(x, n - 1);
        } else {
            // To handle negative power
            return 1 / (x * calculatePower(x, -n - 1));
        }
    }
    //custom method to read a double value since we cant use build in method
    public static double readDouble(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }
    //Another custom method to readint value
    public static int readInt(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }
}
