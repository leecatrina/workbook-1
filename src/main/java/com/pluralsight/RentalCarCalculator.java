package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BASIC_DAILY_RATE = 29.99;
        final double TOLL_TAG_RATE = 3.95;
        final double GPS_RATE = 2.95;
        final double ROADSIDE_ASSIST_RATE = 3.95;
        final double UNDERAGE_SUBCHARGE_RATE = 0.30;

        //PROMPT

        System.out.println("Enter pick up date (MM/DD/YYYY)");
        String pickupDate = scanner.nextLine();

        System.out.println("Enter number of days for the rental: ");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you want an electronic toll tag at $3.95/day? (yes/no): ");
        String tollTag = scanner.nextLine().trim().toLowerCase();

        System.out.println("Do you want GPS at $2.95/day? (yes/no): ");
        String gps = scanner.nextLine().trim().toLowerCase();

        System.out.println("Do you want roadside assistance at $3.95/day? (yes/no): ");
        String roadside = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter you age: ");
        int age = scanner.nextInt();

        //COST
        double basicRentalCost = BASIC_DAILY_RATE * numberOfDays;

        double optionsCost = 0;
        if (tollTag.equals("yes")){
            optionsCost += TOLL_TAG_RATE * numberOfDays;
        }
        if (gps.equals ("yes")){
            optionsCost += GPS_RATE * numberOfDays;
        }
        if (roadside.equals("yes")){
            optionsCost += ROADSIDE_ASSIST_RATE * numberOfDays;
        }

        double underageSurcharge = 0;
        if (age < 25){
            underageSurcharge = basicRentalCost * optionsCost + underageSurcharge;
        }
        double totalCost = basicRentalCost + optionsCost + underageSurcharge;

        //Display
        System.out.println("\n=== RENTAL CAR COST ESTIMATE ===");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Car Rental: $%.2f\n", basicRentalCost);
        System.out.printf("Options Cost: $%.2f\n", optionsCost);
        System.out.printf("Underage Driver Surcharge: $%.2f\n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
    }
}
