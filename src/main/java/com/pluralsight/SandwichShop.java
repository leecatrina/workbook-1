package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double regular = 5.45;
        double large = 8.95;
        double total = 0.0;
        double price;

        System.out.println("What size sandwhich would you like? (Regular/Large) ");
        String size = scanner.nextLine();

        if (size.equalsIgnoreCase("Regular")) {
            total = regular;
        } else if (size.equalsIgnoreCase("Large")) {
            total = large;
        }

        System.out.println("Would you like your sandwhich loaded? (Yes/No) ");
        String loaded = scanner.nextLine();

        if (loaded.equalsIgnoreCase("yes")) {
            if (size.equalsIgnoreCase("regular")) {
                total += 1.00;
            } else if (size.equalsIgnoreCase("large")) {
                total += 1.75;
            }
        }
        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        if (age <= 17) {
            total = total - (total * 0.10);
            System.out.println("10% student discount applied!");
        } else if (age >= 65) {
            total = total - (total * 0.20);
            System.out.println("20% senior discount applied!");
        }

        System.out.printf("Your total is: $%.2f%n", total);
        scanner.close();


    }
}
