/*
Benton Amon
CSCI 1660
1/24/2021
Asks what the city, zip code, and 5 temperatures are of a city and outputs the
information and the average of the temperatures.
 */


package com.company.Amon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize temp and Scanner
        Scanner input = new Scanner(System.in);
        double[] temp;
        temp = new double[5];

        // City
        System.out.println("Enter your city: ");
        String city = input.nextLine();

        // Zip Code
        System.out.println("Enter your zip code: ");
        int zip = input.nextInt();

        // Input Temperatures
        double sum = 0;
        int counter = 0;
        System.out.println("Enter your highest five temperatures (one at a time): ");
        for(int i=0; i<5; i++) {
            System.out.print((i+1) + ": ");
            temp[i] = input.nextDouble();
            sum = sum + temp[i];
            counter = counter + 1;
        }

        // Math
        double avg = 0;
        avg = sum / counter;

        // Output
        System.out.println("City: " + city + " | " + "Zip Code: " + zip + " | " + "Average High Temperature: " + avg);

    }
}
