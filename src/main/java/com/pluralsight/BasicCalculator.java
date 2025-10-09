package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(" Enter another number: ");
        int number2 = scanner.nextInt();

        System.out.println("Add (+), Subtract (-), Multiply (*), or Divide ( / ) " );
        String operation = scanner.next();

        double total = (number * number2);

        System.out.println("Total : " + total);


    }
}
